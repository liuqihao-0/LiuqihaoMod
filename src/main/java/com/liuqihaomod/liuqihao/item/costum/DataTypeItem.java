package com.liuqihaomod.liuqihao.item.costum;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public abstract class DataTypeItem extends Item {
    public DataTypeItem(Item.Properties properties) {
        super(properties);
    }

    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        if (level instanceof ServerLevel serverLevel) {
            if (!player.hasInfiniteMaterials()) {
                player.getItemInHand(hand).shrink(1);
            }

            this.onUse(serverLevel, player, hand);
        }

        return InteractionResult.SUCCESS;
    }

    protected abstract void onUse(ServerLevel var1, Player var2, InteractionHand var3);
}
