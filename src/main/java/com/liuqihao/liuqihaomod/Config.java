package com.liuqihao.liuqihaomod;

import net.neoforged.neoforge.common.ModConfigSpec;

public final class Config {
    private Config() {}
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec.BooleanValue CRASH = BUILDER.comment("0").define("crash", true);    
    public static final ModConfigSpec.ConfigValue<String> CRASH_MESSAGE =BUILDER.comment("1").define("crash_message", "");
    public static final ModConfigSpec SPEC=BUILDER.build();
    // 在编译期控制DataItem的使用与否.
    // 其实是我DataItem还没做完,嘻嘻!
    public static final boolean DATA = false;
}