package com.liuqihaomod.liuqihao.item.costum;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MaceItem;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;

public class CustomMaceItem extends MaceItem {
    private final double damageMultiplier;

    public CustomMaceItem(Item.Properties properties, double damageMultiplier) {
        super(properties);
        this.damageMultiplier = damageMultiplier;
    }

    public float getAttackDamageBonus(Entity victim, float ignoredDamage, DamageSource damageSource) {
        Entity directEntity = damageSource.getDirectEntity();
        if (directEntity instanceof LivingEntity attacker) {
            if (canSmashAttack(attacker)) {
                double fallDistance = attacker.fallDistance;
                double baseDamage;
                if (fallDistance <= (double)3.0F) {
                    baseDamage = (double)4.0F * fallDistance;
                } else if (fallDistance <= (double)8.0F) {
                    baseDamage = (double)12.0F + (double)2.0F * (fallDistance - (double)3.0F);
                } else {
                    baseDamage = (double)22.0F + fallDistance - (double)8.0F;
                }

                double damage = baseDamage * this.damageMultiplier;
                Level level = attacker.level();
                if (level instanceof ServerLevel) {
                    ServerLevel serverLevel = (ServerLevel)level;
                    damage += (double)EnchantmentHelper.modifyFallBasedDamage(serverLevel, attacker.getWeaponItem(), victim, damageSource, 0.0F) * fallDistance;
                }

                return (float)damage;
            }
        }

        return 0.0F;
    }
}
