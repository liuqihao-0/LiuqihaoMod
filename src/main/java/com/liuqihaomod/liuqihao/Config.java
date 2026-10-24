package com.liuqihaomod.liuqihao;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec.BooleanValue CRASH;
    static final ModConfigSpec SPEC;

    public Config() {
    }

    private static boolean validateItemName(Object obj) {
        boolean var10000;
        if (obj instanceof String itemName) {
            if (BuiltInRegistries.ITEM.containsKey(Identifier.parse(itemName))) {
                var10000 = true;
                return var10000;
            }
        }

        var10000 = false;
        return var10000;
    }

    static {
        CRASH = BUILDER.comment("0").define("crash", true);
        SPEC = BUILDER.build();
    }
}