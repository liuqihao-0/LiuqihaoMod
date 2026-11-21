package com.liuqihao.liuqihaomod.event;

import com.liuqihao.liuqihaomod.Config;
import com.liuqihao.liuqihaomod.item.costum.NullItem;
import com.liuqihao.liuqihaomod.network.CrashPayload;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import net.neoforged.neoforge.network.PacketDistributor;

@EventBusSubscriber(modid = "liuqihao")
public class NullCrashHandler {
    @SubscribeEvent
    public static void onServerTick(ServerTickEvent.Post event) {
        if (NullItem.CRASH > 0) {
            --NullItem.CRASH;
            if (NullItem.CRASH == 0) {
                NullItem.CRASH = -1;
                if (Config.CRASH.getAsBoolean()) {
                    String msg = Config.CRASH_MESSAGE.get();
                    String finalMsg = msg.isEmpty() ? "HAHA!Your game have no Exceptnessmention,I'm is imguyifulliable!" : msg;
                    if (NullItem.triggerPlayer != null) {
                        PacketDistributor.sendToPlayer(NullItem.triggerPlayer, new CrashPayload(finalMsg));
                        
                        NullItem.triggerPlayer = null; 
                    }
                }
            }
        }
    }
}