package com.liuqihao.liuqihaomod.item.costum;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

public class IntItem extends DataTypeItem {
    public IntItem(Item.Properties properties) {
        super(properties);
    }
    public void onUse(ServerLevel level, Player player, InteractionHand hand) {
    }
}
