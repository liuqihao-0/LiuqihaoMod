package com.liuqihaomod.liuqihao.item;

import com.liuqihaomod.liuqihao.block.ModBlocks;
import com.liuqihaomod.liuqihao.item.costum.BooleanItem;
import com.liuqihaomod.liuqihao.item.costum.CustomMaceItem;
import com.liuqihaomod.liuqihao.item.costum.NullItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MaceItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.Weapon;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("liuqihao");
    public static final DeferredItem<Item> BUG;
    public static final DeferredItem<Item> GLOWING_BOOK;
    public static final DeferredItem<Item> WAXED_COPPER_APPLE;
    public static final DeferredItem<Item> WAXED_EXPOSED_COPPER_APPLE;
    public static final DeferredItem<Item> WAXED_WEATHERED_COPPER_APPLE;
    public static final DeferredItem<Item> WAXED_OXIDIZED_COPPER_APPLE;
    public static final DeferredItem<Item> OXIDIZED_COPPER_APPLE;
    public static final DeferredItem<Item> WEATHERED_COPPER_APPLE;
    public static final DeferredItem<Item> EXPOSED_COPPER_APPLE;
    public static final DeferredItem<Item> COPPER_APPLE;
    public static final DeferredItem<Item> FAKE_COOKED_BEEF;
    public static final DeferredItem<Item> REAL_COOKED_BEEF;
    public static final DeferredItem<Item> REAL_FAKE_COOKED_BEEF;
    public static final DeferredItem<BlockItem> WOODEN_BLOCK;
    public static final DeferredItem<BlockItem> STONE_BLOCK;
    public static final DeferredItem<BlockItem> WOODEN_HEAVY_CORE;
    public static final DeferredItem<BlockItem> STONE_HEAVY_CORE;
    public static final DeferredItem<BlockItem> COPPER_HEAVY_CORE;
    public static final DeferredItem<BlockItem> IRON_HEAVY_CORE;
    public static final DeferredItem<BlockItem> GOLDEN_HEAVY_CORE;
    public static final DeferredItem<BlockItem> DIAMOND_HEAVY_CORE;
    public static final DeferredItem<BlockItem> NETHERITE_HEAVY_CORE;
    public static final DeferredItem<CustomMaceItem> WOODEN_MACE;
    public static final DeferredItem<CustomMaceItem> STONE_MACE;
    public static final DeferredItem<CustomMaceItem> COPPER_MACE;
    public static final DeferredItem<CustomMaceItem> IRON_MACE;
    public static final DeferredItem<CustomMaceItem> GOLDEN_MACE;
    public static final DeferredItem<CustomMaceItem> DIAMOND_MACE;
    public static final DeferredItem<CustomMaceItem> NETHERITE_MACE;
    public static final DeferredItem<Item> STONE_STICK;
    public static final DeferredItem<Item> COPPER_STICK;
    public static final DeferredItem<Item> IRON_STICK;
    public static final DeferredItem<Item> GOLDEN_STICK;
    public static final DeferredItem<Item> DIAMOND_STICK;
    public static final DeferredItem<Item> NETHERITE_STICK;
    public static final DeferredItem<Item> STONE_FISHING_ROD;
    public static final DeferredItem<Item> COPPER_FISHING_ROD;
    public static final DeferredItem<Item> IRON_FISHING_ROD;
    public static final DeferredItem<Item> GOLDEN_FISHING_ROD;
    public static final DeferredItem<Item> DIAMOND_FISHING_ROD;
    public static final DeferredItem<Item> NETHERITE_FISHING_ROD;
    public static final DeferredItem<Item> BYTE;
    public static final DeferredItem<Item> BYTE_ARRAY;
    public static final DeferredItem<Item> SHORT;
    public static final DeferredItem<Item> SHORT_ARRAY;
    public static final DeferredItem<Item> INT;
    public static final DeferredItem<Item> INT_ARRAY;
    public static final DeferredItem<Item> LONG;
    public static final DeferredItem<Item> LONG_ARRAY;
    public static final DeferredItem<Item> FLOAT;
    public static final DeferredItem<Item> FLOAT_ARRAY;
    public static final DeferredItem<Item> DOUBLE;
    public static final DeferredItem<Item> DOUBLE_ARRAY;
    public static final DeferredItem<BooleanItem> BOOLEAN;
    public static final DeferredItem<Item> BOOLEAN_ARRAY;
    public static final DeferredItem<Item> CHAR;
    public static final DeferredItem<Item> CHAR_ARRAY;
    public static final DeferredItem<Item> OBJECT;
    public static final DeferredItem<Item> OBJECT_ARRAY;
    public static final DeferredItem<NullItem> NULL;

    public ModItems() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static ItemAttributeModifiers Attributes(double attack_damage, double attack_speed) {
        return ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(Item.BASE_ATTACK_DAMAGE_ID, attack_damage, Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).add(Attributes.ATTACK_SPEED, new AttributeModifier(Item.BASE_ATTACK_SPEED_ID, attack_speed, Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).build();
    }

    static {
        BUG = ITEMS.registerSimpleItem("bug");
        GLOWING_BOOK = ITEMS.registerSimpleItem("glowing_book");
        WAXED_COPPER_APPLE = ITEMS.registerSimpleItem("waxed_copper_apple");
        WAXED_EXPOSED_COPPER_APPLE = ITEMS.registerSimpleItem("waxed_exposed_copper_apple");
        WAXED_WEATHERED_COPPER_APPLE = ITEMS.registerSimpleItem("waxed_weathered_copper_apple");
        WAXED_OXIDIZED_COPPER_APPLE = ITEMS.registerSimpleItem("waxed_oxidized_copper_apple");
        OXIDIZED_COPPER_APPLE = ITEMS.registerSimpleItem("oxidized_copper_apple", () -> (new Item.Properties()).food(ModFoods.OXIDIZED_COPPER_APPLE));
        WEATHERED_COPPER_APPLE = ITEMS.registerSimpleItem("weathered_copper_apple", () -> (new Item.Properties()).food(ModFoods.WEATHERED_COPPER_APPLE, ModConsumables.WEATHERED_COPPER_APPLE).usingConvertsTo((Item)OXIDIZED_COPPER_APPLE.get()));
        EXPOSED_COPPER_APPLE = ITEMS.registerSimpleItem("exposed_copper_apple", () -> (new Item.Properties()).food(ModFoods.EXPOSED_COPPER_APPLE, ModConsumables.EXPOSED_COPPER_APPLE).usingConvertsTo((Item)WEATHERED_COPPER_APPLE.get()));
        COPPER_APPLE = ITEMS.registerSimpleItem("copper_apple", () -> (new Item.Properties()).food(ModFoods.COPPER_APPLE, ModConsumables.COPPER_APPLE).usingConvertsTo((Item)EXPOSED_COPPER_APPLE.get()));
        FAKE_COOKED_BEEF = ITEMS.registerSimpleItem("fake_cooked_beef", () -> (new Item.Properties()).food(ModFoods.FAKE_COOKED_BEEF, ModConsumables.FAKE_COOKED_BEEF));
        REAL_COOKED_BEEF = ITEMS.registerSimpleItem("real_cooked_beef", () -> (new Item.Properties()).food(ModFoods.REAL_COOKED_BEEF, ModConsumables.REAL_COOKED_BEEF));
        REAL_FAKE_COOKED_BEEF = ITEMS.registerSimpleItem("real_fake_cooked_beef", () -> (new Item.Properties()).food(ModFoods.REAL_FAKE_COOKED_BEEF, ModConsumables.REAL_FAKE_COOKED_BEEF));
        WOODEN_BLOCK = ITEMS.registerSimpleBlockItem("wooden_block", ModBlocks.WOODEN_BLOCK);
        STONE_BLOCK = ITEMS.registerSimpleBlockItem("stone_block", ModBlocks.STONE_BLOCK);
        WOODEN_HEAVY_CORE = ITEMS.registerSimpleBlockItem("wooden_heavy_core", ModBlocks.WOODEN_HEAVY_CORE);
        STONE_HEAVY_CORE = ITEMS.registerSimpleBlockItem("stone_heavy_core", ModBlocks.STONE_HEAVY_CORE);
        COPPER_HEAVY_CORE = ITEMS.registerSimpleBlockItem("copper_heavy_core", ModBlocks.COPPER_HEAVY_CORE);
        IRON_HEAVY_CORE = ITEMS.registerSimpleBlockItem("iron_heavy_core", ModBlocks.IRON_HEAVY_CORE);
        GOLDEN_HEAVY_CORE = ITEMS.registerSimpleBlockItem("golden_heavy_core", ModBlocks.GOLDEN_HEAVY_CORE);
        DIAMOND_HEAVY_CORE = ITEMS.registerSimpleBlockItem("diamond_heavy_core", ModBlocks.DIAMOND_HEAVY_CORE, (properties) -> properties.rarity(Rarity.RARE));
        NETHERITE_HEAVY_CORE = ITEMS.registerSimpleBlockItem("netherite_heavy_core", ModBlocks.NETHERITE_HEAVY_CORE, (properties) -> properties.rarity(Rarity.EPIC));
        WOODEN_MACE = ITEMS.registerItem("wooden_mace", (properties) -> new CustomMaceItem(properties.durability(59).component(DataComponents.TOOL, MaceItem.createToolProperties()).repairable(WOODEN_BLOCK.asItem()).attributes(Attributes(2.0F, -3.1)).enchantable(15).component(DataComponents.WEAPON, new Weapon(1)), 0.6));
        STONE_MACE = ITEMS.registerItem("stone_mace", (properties) -> new CustomMaceItem(properties.durability(131).component(DataComponents.TOOL, MaceItem.createToolProperties()).repairable(STONE_BLOCK.asItem()).attributes(Attributes(3.0F, -3.15)).enchantable(5).component(DataComponents.WEAPON, new Weapon(1)), 0.75));
        COPPER_MACE = ITEMS.registerItem("copper_mace", (properties) -> new CustomMaceItem(properties.durability(190).component(DataComponents.TOOL, MaceItem.createToolProperties()).repairable(Items.COPPER_BLOCK.weathering().unaffected()).attributes(Attributes(3.0F, -3.2)).enchantable(13).component(DataComponents.WEAPON, new Weapon(1)), 0.8));
        IRON_MACE = ITEMS.registerItem("iron_mace", (properties) -> new CustomMaceItem(properties.durability(250).component(DataComponents.TOOL, MaceItem.createToolProperties()).repairable(Items.IRON_BLOCK).attributes(Attributes(4.0F, -3.25F)).enchantable(14).component(DataComponents.WEAPON, new Weapon(1)), 0.9));
        GOLDEN_MACE = ITEMS.registerItem("golden_mace", (properties) -> new CustomMaceItem(properties.durability(32).component(DataComponents.TOOL, MaceItem.createToolProperties()).repairable(Items.GOLD_BLOCK).attributes(Attributes(2.0F, -3.3)).enchantable(22).component(DataComponents.WEAPON, new Weapon(1)), 0.95));
        DIAMOND_MACE = ITEMS.registerItem("diamond_mace", (properties) -> new CustomMaceItem(properties.rarity(Rarity.RARE).durability(1561).component(DataComponents.TOOL, MaceItem.createToolProperties()).repairable(Items.DIAMOND_BLOCK).attributes(Attributes(5.0F, -3.35)).enchantable(10).component(DataComponents.WEAPON, new Weapon(1)), 1.05));
        NETHERITE_MACE = ITEMS.registerItem("netherite_mace", (properties) -> new CustomMaceItem(properties.rarity(Rarity.EPIC).durability(2031).component(DataComponents.TOOL, MaceItem.createToolProperties()).repairable(Items.NETHERITE_BLOCK).attributes(Attributes(6.0F, -3.4)).enchantable(15).component(DataComponents.WEAPON, new Weapon(1)), 1.2));
        STONE_STICK = ITEMS.registerSimpleItem("stone_stick");
        COPPER_STICK = ITEMS.registerSimpleItem("copper_stick");
        IRON_STICK = ITEMS.registerSimpleItem("iron_stick");
        GOLDEN_STICK = ITEMS.registerSimpleItem("golden_stick");
        DIAMOND_STICK = ITEMS.registerSimpleItem("diamond_stick");
        NETHERITE_STICK = ITEMS.registerSimpleItem("netherite_stick");
        STONE_FISHING_ROD = ITEMS.registerItem("stone_fishing_rod", (properties) -> new FishingRodItem(properties.durability(131).enchantable(1)));
        COPPER_FISHING_ROD = ITEMS.registerItem("copper_fishing_rod", (properties) -> new FishingRodItem(properties.durability(190).enchantable(1)));
        IRON_FISHING_ROD = ITEMS.registerItem("iron_fishing_rod", (properties) -> new FishingRodItem(properties.durability(250).enchantable(1)));
        GOLDEN_FISHING_ROD = ITEMS.registerItem("golden_fishing_rod", (properties) -> new FishingRodItem(properties.durability(32).enchantable(1)));
        DIAMOND_FISHING_ROD = ITEMS.registerItem("diamond_fishing_rod", (properties) -> new FishingRodItem(properties.durability(1561).enchantable(1)));
        NETHERITE_FISHING_ROD = ITEMS.registerItem("netherite_fishing_rod", (properties) -> new FishingRodItem(properties.durability(2031).enchantable(1)));
        BYTE = ITEMS.registerSimpleItem("byte");
        BYTE_ARRAY = ITEMS.registerSimpleItem("byte_array");
        SHORT = ITEMS.registerSimpleItem("short");
        SHORT_ARRAY = ITEMS.registerSimpleItem("short_array");
        INT = ITEMS.registerSimpleItem("int");
        INT_ARRAY = ITEMS.registerSimpleItem("int_array");
        LONG = ITEMS.registerSimpleItem("long");
        LONG_ARRAY = ITEMS.registerSimpleItem("long_array");
        FLOAT = ITEMS.registerSimpleItem("float");
        FLOAT_ARRAY = ITEMS.registerSimpleItem("float_array");
        DOUBLE = ITEMS.registerSimpleItem("double");
        DOUBLE_ARRAY = ITEMS.registerSimpleItem("double_array");
        BOOLEAN = ITEMS.registerItem("boolean", BooleanItem::new);
        BOOLEAN_ARRAY = ITEMS.registerSimpleItem("boolean_array");
        CHAR = ITEMS.registerSimpleItem("char");
        CHAR_ARRAY = ITEMS.registerSimpleItem("char_array");
        OBJECT = ITEMS.registerSimpleItem("object");
        OBJECT_ARRAY = ITEMS.registerSimpleItem("object_array");
        NULL = ITEMS.registerItem("null", NullItem::new);
    }
}
