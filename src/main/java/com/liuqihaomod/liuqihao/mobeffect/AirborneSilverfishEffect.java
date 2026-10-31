package com.liuqihaomod.liuqihao.mobeffect;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

public class AirborneSilverfishEffect extends MobEffect {
    public AirborneSilverfishEffect() {
        super(MobEffectCategory.HARMFUL, 9214860);
    }

    public boolean applyEffectTick(ServerLevel level, LivingEntity mob, int amplification) {
        if (!(mob instanceof Player)) {
            return true;
        } else {
            int spawnAmount = 64 << Math.min(amplification, 4);
            RandomSource random = mob.getRandom();

            for(int i = 0; i < spawnAmount; ++i) {
                double offsetX = (double)Mth.randomBetween(random, -16.0F, 16.0F);
                double offsetZ = (double)Mth.randomBetween(random, -16.0F, 16.0F);
                double spawnX = mob.getX() + offsetX;
                double spawnY = mob.getY() + (double)mob.getBbHeight() + (double)16.0F;
                double spawnZ = mob.getZ() + offsetZ;
                this.spawnSilverfish(level, mob, spawnX, spawnY, spawnZ);
            }

            return true;
        }
    }

    private void spawnSilverfish(ServerLevel level, LivingEntity mob, double x, double y, double z) {
        Silverfish silverfish = EntityTypes.SILVERFISH.create(level, EntitySpawnReason.TRIGGERED);
        if (silverfish != null) {
            RandomSource random = mob.getRandom();
            silverfish.snapTo(x, y, z, random.nextFloat() * 360.0F, 0.0F);
            silverfish.setDeltaMovement(Vec3.ZERO);
            silverfish.getAttribute(Attributes.SAFE_FALL_DISTANCE).setBaseValue((double)30.0F);
            silverfish.getAttribute(Attributes.MAX_HEALTH).setBaseValue((double)80.0F);
            silverfish.setHealth(80.0F);
            level.addFreshEntity(silverfish);
            silverfish.playSound(SoundEvents.SILVERFISH_HURT);
        }

    }

    public boolean shouldApplyEffectTickThisTick(int tickCount, int amplification) {
        return tickCount % 10 == 0;
    }
}