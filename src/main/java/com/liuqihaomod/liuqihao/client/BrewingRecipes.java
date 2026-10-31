package com.liuqihaomod.liuqihao.client;

import com.liuqihaomod.liuqihao.item.ModPotions;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;

@EventBusSubscriber(
    modid = "liuqihao"
)
public class BrewingRecipes {
    public BrewingRecipes() {
    }

    @SubscribeEvent
    public static void registerBrewingRecipes(RegisterBrewingRecipesEvent event) {
        PotionBrewing.Builder builder = event.getBuilder();
        builder.addMix(Potions.TURTLE_MASTER, Items.FERMENTED_SPIDER_EYE, ModPotions.SPEED_MASTER);
        builder.addMix(ModPotions.SPEED_MASTER, Items.REDSTONE, ModPotions.LONG_SPEED_MASTER);
        builder.addMix(ModPotions.SPEED_MASTER, Items.GLOWSTONE_DUST, ModPotions.STRONG_SPEED_MASTER);
        builder.addMix(Potions.INFESTED, Items.PUFFERFISH, ModPotions.AIRBORNE_SILVERFISH);
    }
}