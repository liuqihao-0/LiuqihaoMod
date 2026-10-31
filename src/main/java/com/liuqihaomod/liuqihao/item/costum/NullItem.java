package com.liuqihaomod.liuqihao.item.costum;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

public class NullItem extends DataTypeItem {
    public static int CRASH = -1;

    public NullItem(Item.Properties properties) {
        super(properties);
    }

    protected void onUse(ServerLevel level, Player player, InteractionHand hand) {
        CRASH = 1;
    }
}