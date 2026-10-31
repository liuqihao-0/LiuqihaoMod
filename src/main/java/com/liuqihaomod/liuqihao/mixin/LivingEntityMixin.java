package com.liuqihaomod.liuqihao.mixin;

import com.liuqihaomod.liuqihao.mobeffect.ModMobEffects;
import java.util.Stack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.CombatRules;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.damagesource.DamageContainer;
import net.neoforged.neoforge.common.damagesource.DamageContainer.Reduction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({LivingEntity.class})
public abstract class LivingEntityMixin {
    @Shadow
    protected Stack<DamageContainer> damageContainers;

    public LivingEntityMixin() {
    }

    @Overwrite
    protected float getDamageAfterMagicAbsorb(DamageSource damageSource, float damage) {
        LivingEntity self = (LivingEntity)(Object)this;
        if (damageSource.is(DamageTypeTags.BYPASSES_EFFECTS)) {
            return damage;
        } else {
            int Amp = 0;
            boolean hasResistance = self.hasEffect(MobEffects.RESISTANCE);
            boolean hasNoResistance = self.hasEffect(ModMobEffects.NO_RESISTANCE);
            if ((hasResistance || hasNoResistance) && !damageSource.is(DamageTypeTags.BYPASSES_RESISTANCE)) {
                int resistAmp = hasResistance ? self.getEffect(MobEffects.RESISTANCE).getAmplifier() + 1 : 0;
                int downAmp = hasNoResistance ? self.getEffect(ModMobEffects.NO_RESISTANCE).getAmplifier() + 1 : 0;
                Amp = resistAmp - downAmp;
            }

            float absorb = 1.0F;
            if (Amp < 0) {
                absorb = 1.0F - (float)Amp * 0.2F;
            }

            if (Amp > 0) {
                absorb = 1.0F - (float)Amp * 0.1F;
            }

            float oldDamage = damage;
            damage = Math.max(damage * absorb, 0.0F);
            this.damageContainers.peek().setNewDamage(damage);
            float damageResisted = oldDamage - damage;
            if (0.0F < damageResisted & damageResisted < Float.MAX_VALUE) {
                this.damageContainers.peek().setReduction(Reduction.MOB_EFFECTS, damageResisted);
                if (self instanceof ServerPlayer) {
                    ((ServerPlayer)self).awardStat(Stats.DAMAGE_RESISTED, Math.round(damageResisted * 10.0F));
                } else if (damageSource.getEntity() instanceof ServerPlayer) {
                    ((ServerPlayer)damageSource.getEntity()).awardStat(Stats.DAMAGE_DEALT_RESISTED, Math.round(damageResisted * 10.0F));
                }
            }

            if (damage <= 0.0F) {
                return 0.0F;
            } else if (damageSource.is(DamageTypeTags.BYPASSES_ENCHANTMENTS)) {
                return damage;
            } else {
                Level var12 = self.level();
                float enchantmentArmor;
                if (var12 instanceof ServerLevel) {
                    ServerLevel serverLevel = (ServerLevel)var12;
                    enchantmentArmor = EnchantmentHelper.getDamageProtection(serverLevel, self, damageSource);
                } else {
                    enchantmentArmor = 0.0F;
                }

                if (enchantmentArmor > 0.0F) {
                    damage = CombatRules.getDamageAfterMagicAbsorb(damage, enchantmentArmor);
                    ((DamageContainer)this.damageContainers.peek()).setReduction(Reduction.ENCHANTMENTS, ((DamageContainer)this.damageContainers.peek()).getNewDamage() - damage);
                }

                return damage;
            }
        }
    }
}