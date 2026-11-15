package com.liuqihao.liuqihaomod;

import com.liuqihao.liuqihaomod.block.ModBlocks;
import com.liuqihao.liuqihaomod.item.ModItemGroups;
import com.liuqihao.liuqihaomod.item.ModItems;
import com.liuqihao.liuqihaomod.item.ModPotions;
import com.liuqihao.liuqihaomod.mobeffect.ModMobEffects;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;

@Mod(LiuqihaoMod.MOD_ID)
public final class LiuqihaoMod {
    public static final String MOD_ID = "liuqihao";
    public static final Logger LOGGER = LogUtils.getLogger();
    public LiuqihaoMod(IEventBus modEventBus, ModContainer modContainer) {
        ModItemGroups.register(modEventBus);
        ModItems.register(modEventBus);
        ModMobEffects.register(modEventBus);
        ModPotions.register(modEventBus);
        ModBlocks.register(modEventBus);
        //NeoForge.EVENT_BUS.register(this);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}