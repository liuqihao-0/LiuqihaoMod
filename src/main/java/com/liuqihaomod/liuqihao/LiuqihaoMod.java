package com.liuqihaomod.liuqihao;

import com.liuqihaomod.liuqihao.block.ModBlocks;
import com.liuqihaomod.liuqihao.item.ModItemGroups;
import com.liuqihaomod.liuqihao.item.ModItems;
import com.liuqihaomod.liuqihao.item.ModPotions;
import com.liuqihaomod.liuqihao.mobeffect.ModMobEffects;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
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
        modEventBus.addListener(this::clientInit);
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void clientInit(FMLClientSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }

}
