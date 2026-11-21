package com.liuqihao.liuqihaomod.item.costum;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

public class NullItem extends DataTypeItem {
    public static int CRASH = -1;
    public static ServerPlayer triggerPlayer = null;

    public NullItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public void onUse(ServerLevel level, Player player, InteractionHand hand) {
        if (!level.isClientSide() && player instanceof ServerPlayer serverPlayer) {
            triggerPlayer = serverPlayer;
            CRASH = 1;
        }
    }
}