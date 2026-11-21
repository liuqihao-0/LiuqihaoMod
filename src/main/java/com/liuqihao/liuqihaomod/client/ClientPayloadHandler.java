package com.liuqihao.liuqihaomod.client;

import com.liuqihao.liuqihaomod.network.CrashPayload;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import net.neoforged.neoforge.network.handling.IPayloadContext;

@EventBusSubscriber(modid = "liuqihao", value = Dist.CLIENT)
public class ClientPayloadHandler {

    private static void handleCrash(final CrashPayload payload, final IPayloadContext context) {
        context.enqueueWork(() -> {
            throw new NullPointerException(payload.message());
        });
    }
}