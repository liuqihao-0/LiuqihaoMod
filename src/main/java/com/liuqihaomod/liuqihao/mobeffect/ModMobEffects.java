package com.liuqihaomod.liuqihao.mobeffect;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModMobEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS;
    public static final DeferredHolder<MobEffect, AirborneSilverfishEffect> AIRBORNE_SILVERFISH;
    public static final Holder<MobEffect> HEALTH_LOWER;
    public static final Holder<MobEffect> NO_RESISTANCE;

    public ModMobEffects() {
    }

    public static void register(IEventBus modEventBus) {
        MOB_EFFECTS.register(modEventBus);
    }

    static {
        MOB_EFFECTS = DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, "liuqihao");
        AIRBORNE_SILVERFISH = MOB_EFFECTS.register("airborne_silverfish", AirborneSilverfishEffect::new);
        HEALTH_LOWER = MOB_EFFECTS.register("health_lower", () -> (new ModMobEffect(MobEffectCategory.HARMFUL, 16284963)).addAttributeModifier(Attributes.MAX_HEALTH, Identifier.fromNamespaceAndPath("liuqihao", "effect.health_lower"), (double)-4.0F, Operation.ADD_VALUE));
        NO_RESISTANCE = MOB_EFFECTS.register("no_resistance", () -> new ModMobEffect(MobEffectCategory.HARMFUL, 9520880));
    }
}
