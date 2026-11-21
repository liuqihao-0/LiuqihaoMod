package com.liuqihao.liuqihaomod.item.costum;

import com.liuqihao.liuqihaomod.item.ModDamageType;
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

    public void onUse(ServerLevel level, Player player, InteractionHand hand) {
        if (player.getRandom().nextBoolean()) {
            player.addEffect(new MobEffectInstance(MobEffects.SPEED, 24000, 3));
            player.addEffect(new MobEffectInstance(MobEffects.HASTE, 24000, 3));
            player.addEffect(new MobEffectInstance(MobEffects.STRENGTH, 24000, 3));
            player.addEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 30, 3));
            player.addEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 24000, 3));
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 24000, 3));
            player.addEffect(new MobEffectInstance(MobEffects.RESISTANCE, 24000, 3));
            player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 24000));
            player.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 24000));
            player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 24000));
            player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 24000, 3));
            player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 24000, 3));
            player.addEffect(new MobEffectInstance(MobEffects.SATURATION, 400, 3));
            player.addEffect(new MobEffectInstance(MobEffects.LUCK, 24000, 3));
        } else {
            DamageSource damageSource = new DamageSource((Holder)level.registryAccess().lookupOrThrow(Registries.DAMAGE_TYPE).get(ModDamageType.BOOLEAN_FALSE.identifier()).orElseThrow());
            player.hurtServer(level, damageSource, 1000000.0F);
        }

    }
}
