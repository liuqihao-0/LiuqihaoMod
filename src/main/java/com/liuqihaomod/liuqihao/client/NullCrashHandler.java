package com.liuqihaomod.liuqihao.client;

import com.liuqihaomod.liuqihao.Config;
import com.liuqihaomod.liuqihao.item.costum.NullItem;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

@EventBusSubscriber(
    modid = "liuqihao"
)
public class NullCrashHandler {
    @SubscribeEvent
    public static void onServerTick(ServerTickEvent.Post event) {
        if (NullItem.CRASH > 0) {
            --NullItem.CRASH;
            if (NullItem.CRASH == 0) {
                NullItem.CRASH = -1;
                if (Config.CRASH.getAsBoolean())
                    throw new NullPointerException("HAHA!Your hbnf have no Exceptnessmention,I'm is imguyifulliable!");
                else
                    NullItem.CRASH = -1;
            }
        }
    }
}
