package com.liuqihaomod.liuqihao.item;

import com.liuqihaomod.liuqihao.mobeffect.ModMobEffects;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS;
    public static final Holder<Potion> SPEED_MASTER;
    public static final Holder<Potion> LONG_SPEED_MASTER;
    public static final Holder<Potion> STRONG_SPEED_MASTER;
    public static final Holder<Potion> AIRBORNE_SILVERFISH;

    public ModPotions() {
    }

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }

    static {
        POTIONS = DeferredRegister.create(BuiltInRegistries.POTION, "liuqihao");
        SPEED_MASTER = POTIONS.register("speed_master", (registryName) -> new Potion("speed_master", new MobEffectInstance[]{new MobEffectInstance(ModMobEffects.NO_RESISTANCE, 600, 2), new MobEffectInstance(MobEffects.SPEED, 600, 2)}));
        LONG_SPEED_MASTER = POTIONS.register("long_speed_master", (registryName) -> new Potion("speed_master", new MobEffectInstance[]{new MobEffectInstance(ModMobEffects.NO_RESISTANCE, 1200, 2), new MobEffectInstance(MobEffects.SPEED, 1200, 2)}));
        STRONG_SPEED_MASTER = POTIONS.register("strong_speed_master", (registryName) -> new Potion("speed_master", new MobEffectInstance[]{new MobEffectInstance(ModMobEffects.NO_RESISTANCE, 450, 3), new MobEffectInstance(MobEffects.SPEED, 450, 3)}));
        AIRBORNE_SILVERFISH = POTIONS.register("airborne_silverfish", (registryName) -> new Potion("airborne_silverfish", new MobEffectInstance[]{new MobEffectInstance(ModMobEffects.AIRBORNE_SILVERFISH, 900)}));
    }
}