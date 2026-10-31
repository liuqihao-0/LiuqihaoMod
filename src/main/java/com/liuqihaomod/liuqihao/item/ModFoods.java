package com.liuqihaomod.liuqihao.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties NULL = (new FoodProperties.Builder()).nutrition(0).saturationModifier(0.0F).alwaysEdible().build();
    public static final FoodProperties COPPER_APPLE = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.8F).alwaysEdible().build();
    public static final FoodProperties EXPOSED_COPPER_APPLE = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.6F).alwaysEdible().build();
    public static final FoodProperties OXIDIZED_COPPER_APPLE = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodProperties WEATHERED_COPPER_APPLE = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3F).alwaysEdible().build();
    public static final FoodProperties FAKE_COOKED_BEEF = (new FoodProperties.Builder()).nutrition(-8).saturationModifier(0.8F).alwaysEdible().build();
    public static final FoodProperties REAL_COOKED_BEEF = (new FoodProperties.Builder()).nutrition(8).saturationModifier(0.8F).alwaysEdible().build();
    public static final FoodProperties REAL_FAKE_COOKED_BEEF = (new FoodProperties.Builder()).nutrition(0).saturationModifier(0.8F).alwaysEdible().build();

    public ModFoods() {
    }
}