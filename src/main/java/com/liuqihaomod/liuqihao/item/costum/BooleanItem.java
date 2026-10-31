package com.liuqihaomod.liuqihao.item.costum;

import com.liuqihaomod.liuqihao.item.ModDamageType;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

public class BooleanItem extends DataTypeItem {
    public BooleanItem(Item.Properties properties) {
        super(properties);
    }

    protected void onUse(ServerLevel level, Player player, InteractionHand hand) {
        if (player.getRandom().nextBoolean()) {
            player.addEffect(new MobEffectInstance(MobEffects.SPEED, 6000, 3));
            player.addEffect(new MobEffectInstance(MobEffects.HASTE, 6000, 3));
            player.addEffect(new MobEffectInstance(MobEffects.STRENGTH, 6000, 3));
            player.addEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 30, 3));
            player.addEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 6000, 3));
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 6000, 3));
            player.addEffect(new MobEffectInstance(MobEffects.RESISTANCE, 6000, 3));
            player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000));
            player.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 6000));
            player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 6000));
            player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 6000, 3));
            player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 6000, 3));
            player.addEffect(new MobEffectInstance(MobEffects.SATURATION, 30, 3));
            player.addEffect(new MobEffectInstance(MobEffects.LUCK, 6000, 3));
        } else {
            DamageSource damageSource = new DamageSource((Holder)level.registryAccess().lookupOrThrow(Registries.DAMAGE_TYPE).get(ModDamageType.BOOLEAN_FALSE.identifier()).orElseThrow());
            player.hurtServer(level, damageSource, Float.MAX_VALUE);
        }

    }
}
