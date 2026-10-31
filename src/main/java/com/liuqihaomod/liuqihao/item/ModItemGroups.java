package com.liuqihaomod.liuqihao.item;

import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItemGroups {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS;
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LIUQIHAO_ITEM_TAB;
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LIUQIHAO_POTION_TAB;

    public ModItemGroups() {
    }

    private static ItemStack createPotion(Item item, Holder<Potion> potion) {
        ItemStack stack = new ItemStack(item);
        stack.set(DataComponents.POTION_CONTENTS, new PotionContents(potion));
        return stack;
    }

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    static {
        CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "liuqihao");
        LIUQIHAO_ITEM_TAB = CREATIVE_MODE_TABS.register("liuqihao_item_tab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.liuqihao_item_tab")).icon(() -> new ItemStack((ItemLike)ModItems.GLOWING_BOOK.get())).displayItems((parameters, output) -> {
                output.accept(ModItems.BUG);
                output.accept(ModItems.GLOWING_BOOK);
                output.accept(ModItems.REAL_COOKED_BEEF);
                output.accept(ModItems.FAKE_COOKED_BEEF);
                output.accept(ModItems.REAL_FAKE_COOKED_BEEF);
                output.accept(ModItems.COPPER_APPLE);
                output.accept(ModItems.EXPOSED_COPPER_APPLE);
                output.accept(ModItems.WEATHERED_COPPER_APPLE);
                output.accept(ModItems.OXIDIZED_COPPER_APPLE);
                output.accept(ModItems.WAXED_COPPER_APPLE);
                output.accept(ModItems.WAXED_EXPOSED_COPPER_APPLE);
                output.accept(ModItems.WAXED_WEATHERED_COPPER_APPLE);
                output.accept(ModItems.WAXED_OXIDIZED_COPPER_APPLE);
                output.accept(ModItems.BYTE);
                output.accept(ModItems.BYTE_ARRAY);
                output.accept(ModItems.SHORT);
                output.accept(ModItems.SHORT_ARRAY);
                output.accept(ModItems.INT);
                output.accept(ModItems.INT_ARRAY);
                output.accept(ModItems.LONG);
                output.accept(ModItems.LONG_ARRAY);
                output.accept(ModItems.FLOAT);
                output.accept(ModItems.FLOAT_ARRAY);
                output.accept(ModItems.DOUBLE);
                output.accept(ModItems.DOUBLE_ARRAY);
                output.accept(ModItems.BOOLEAN);
                output.accept(ModItems.BOOLEAN_ARRAY);
                output.accept(ModItems.CHAR);
                output.accept(ModItems.CHAR_ARRAY);
                output.accept(ModItems.OBJECT);
                output.accept(ModItems.OBJECT_ARRAY);
                output.accept(ModItems.NULL);
                output.accept(ModItems.STONE_STICK);
                output.accept(ModItems.COPPER_STICK);
                output.accept(ModItems.IRON_STICK);
                output.accept(ModItems.GOLDEN_STICK);
                output.accept(ModItems.DIAMOND_STICK);
                output.accept(ModItems.NETHERITE_STICK);
                output.accept(ModItems.STONE_FISHING_ROD);
                output.accept(ModItems.COPPER_FISHING_ROD);
                output.accept(ModItems.IRON_FISHING_ROD);
                output.accept(ModItems.GOLDEN_FISHING_ROD);
                output.accept(ModItems.DIAMOND_FISHING_ROD);
                output.accept(ModItems.NETHERITE_FISHING_ROD);
                output.accept(ModItems.WOODEN_BLOCK);
                output.accept(ModItems.STONE_BLOCK);
                output.accept(ModItems.WOODEN_HEAVY_CORE);
                output.accept(ModItems.STONE_HEAVY_CORE);
                output.accept(ModItems.COPPER_HEAVY_CORE);
                output.accept(ModItems.IRON_HEAVY_CORE);
                output.accept(ModItems.GOLDEN_HEAVY_CORE);
                output.accept(ModItems.DIAMOND_HEAVY_CORE);
                output.accept(ModItems.NETHERITE_HEAVY_CORE);
                output.accept(ModItems.WOODEN_MACE);
                output.accept(ModItems.STONE_MACE);
                output.accept(ModItems.COPPER_MACE);
                output.accept(ModItems.IRON_MACE);
                output.accept(ModItems.GOLDEN_MACE);
                output.accept(ModItems.DIAMOND_MACE);
                output.accept(ModItems.NETHERITE_MACE);
            }).build());
        LIUQIHAO_POTION_TAB = CREATIVE_MODE_TABS.register("liuqihao_potion_tab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.liuqihao_potion_tab")).icon(() -> new ItemStack(Items.POTION)).displayItems((parameters, output) -> {
                output.accept(createPotion(Items.POTION, ModPotions.AIRBORNE_SILVERFISH));
                output.accept(createPotion(Items.POTION, ModPotions.SPEED_MASTER));
                output.accept(createPotion(Items.POTION, ModPotions.LONG_SPEED_MASTER));
                output.accept(createPotion(Items.POTION, ModPotions.STRONG_SPEED_MASTER));
                output.accept(createPotion(Items.SPLASH_POTION, ModPotions.AIRBORNE_SILVERFISH));
                output.accept(createPotion(Items.SPLASH_POTION, ModPotions.SPEED_MASTER));
                output.accept(createPotion(Items.SPLASH_POTION, ModPotions.LONG_SPEED_MASTER));
                output.accept(createPotion(Items.SPLASH_POTION, ModPotions.STRONG_SPEED_MASTER));
                output.accept(createPotion(Items.LINGERING_POTION, ModPotions.AIRBORNE_SILVERFISH));
                output.accept(createPotion(Items.LINGERING_POTION, ModPotions.SPEED_MASTER));
                output.accept(createPotion(Items.LINGERING_POTION, ModPotions.LONG_SPEED_MASTER));
                output.accept(createPotion(Items.LINGERING_POTION, ModPotions.STRONG_SPEED_MASTER));
            }).build());
    }
}
