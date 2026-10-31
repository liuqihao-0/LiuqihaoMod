package com.liuqihaomod.liuqihao.item;

import java.util.List;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModConsumables {
    public static final Consumable COPPER_APPLE;
    public static final Consumable EXPOSED_COPPER_APPLE;
    public static final Consumable WEATHERED_COPPER_APPLE;
    public static final Consumable FAKE_COOKED_BEEF;
    public static final Consumable REAL_COOKED_BEEF;
    public static final Consumable REAL_FAKE_COOKED_BEEF;

    public ModConsumables() {
    }

    static {
        COPPER_APPLE = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of(new MobEffectInstance(MobEffects.REGENERATION, 90, 1), new MobEffectInstance(MobEffects.ABSORPTION, 720, 0)))).build();
        EXPOSED_COPPER_APPLE = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of(new MobEffectInstance(MobEffects.REGENERATION, 60, 1), new MobEffectInstance(MobEffects.ABSORPTION, 720, 0)))).build();
        WEATHERED_COPPER_APPLE = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 30, 1))).build();
        FAKE_COOKED_BEEF = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of(new MobEffectInstance(MobEffects.POISON, 450, 4), new MobEffectInstance(MobEffects.SLOWNESS, 400, 8), new MobEffectInstance(MobEffects.WEAKNESS, 1800, 3), new MobEffectInstance(MobEffects.WIND_CHARGED, 3600, 0), new MobEffectInstance(MobEffects.WEAVING, 3600, 0), new MobEffectInstance(MobEffects.OOZING, 3600, 0), new MobEffectInstance(MobEffects.INFESTED, 3600, 0)))).build();
        REAL_COOKED_BEEF = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of(new MobEffectInstance(MobEffects.SPEED, 1800, 4), new MobEffectInstance(MobEffects.STRENGTH, 1800, 4), new MobEffectInstance(MobEffects.JUMP_BOOST, 1800, 4), new MobEffectInstance(MobEffects.REGENERATION, 450, 4), new MobEffectInstance(MobEffects.RESISTANCE, 400, 6), new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0), new MobEffectInstance(MobEffects.WATER_BREATHING, 1200, 0), new MobEffectInstance(MobEffects.INVISIBILITY, 3600, 0), new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 0)))).build();
        REAL_FAKE_COOKED_BEEF = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of(new MobEffectInstance(MobEffects.POISON, 450, 4), new MobEffectInstance(MobEffects.SLOWNESS, 400, 8), new MobEffectInstance(MobEffects.WEAKNESS, 1800, 3), new MobEffectInstance(MobEffects.WIND_CHARGED, 3600, 0), new MobEffectInstance(MobEffects.WEAVING, 3600, 0), new MobEffectInstance(MobEffects.OOZING, 3600, 0), new MobEffectInstance(MobEffects.INFESTED, 3600, 0), new MobEffectInstance(MobEffects.LEVITATION, 2, 255, false, false, false), new MobEffectInstance(MobEffects.SPEED, 1800, 4), new MobEffectInstance(MobEffects.STRENGTH, 1800, 4), new MobEffectInstance(MobEffects.JUMP_BOOST, 1800, 4), new MobEffectInstance(MobEffects.REGENERATION, 450, 4), new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0), new MobEffectInstance(MobEffects.WATER_BREATHING, 1200, 0), new MobEffectInstance(MobEffects.INVISIBILITY, 3600, 0), new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 0)))).build();
    }
}
