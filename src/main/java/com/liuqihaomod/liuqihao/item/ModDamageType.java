package com.liuqihaomod.liuqihao.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageType;

public class ModDamageType {
    public static final ResourceKey<DamageType> BOOLEAN_FALSE;
    static {
        BOOLEAN_FALSE = ResourceKey.create(Registries.DAMAGE_TYPE, Identifier.fromNamespaceAndPath("liuqihao", "boolean_false"));
    }
}