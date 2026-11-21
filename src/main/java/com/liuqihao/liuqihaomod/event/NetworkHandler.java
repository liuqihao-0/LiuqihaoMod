package com.liuqihao.liuqihaomod.event;

import com.liuqihao.liuqihaomod.network.CrashPayload;
import net.minecraft.CrashReport;
import net.minecraft.client.Minecraft;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;

@EventBusSubscriber(modid = "liuqihao")
public class NetworkHandler {
    @SubscribeEvent
    public static void registerPayloads(RegisterPayloadHandlersEvent event) {
        var registrar = event.registrar("1");
        registrar.playToClient(
                CrashPayload.TYPE,
                CrashPayload.STREAM_CODEC,
                (payload, ctx) -> ctx.enqueueWork(() -> {
                    Minecraft mc = Minecraft.getInstance();
                    CrashReport report = new CrashReport("crash", new NullPointerException(payload.message()));
                    mc.emergencySaveAndCrash(report);
                })
        );
    }
}