package com.liuqihaomod.liuqihao.block;

import java.util.function.Function;
import java.util.function.Supplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HeavyCoreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks("liuqihao");
    public static final DeferredBlock<Block> WOODEN_BLOCK = registerBlock("wooden_block", (properties) -> new Block(properties.mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> STONE_BLOCK = registerBlock("stone_block", (properties) -> new Block(properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).strength(3.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WOODEN_HEAVY_CORE = registerBlock("wooden_heavy_core", (properties) -> new HeavyCoreBlock(properties.mapColor(MapColor.METAL).instrument(NoteBlockInstrument.SNARE).sound(SoundType.HEAVY_CORE).strength(4.0F).pushReaction(PushReaction.NORMAL).explosionResistance(1200.0F)));
    public static final DeferredBlock<Block> STONE_HEAVY_CORE = registerBlock("stone_heavy_core", (properties) -> new HeavyCoreBlock(properties.mapColor(MapColor.METAL).instrument(NoteBlockInstrument.SNARE).sound(SoundType.HEAVY_CORE).strength(5.0F).pushReaction(PushReaction.NORMAL).explosionResistance(1200.0F)));
    public static final DeferredBlock<Block> COPPER_HEAVY_CORE = registerBlock("copper_heavy_core", (properties) -> new HeavyCoreBlock(properties.mapColor(MapColor.METAL).instrument(NoteBlockInstrument.SNARE).sound(SoundType.HEAVY_CORE).strength(6.0F).pushReaction(PushReaction.NORMAL).explosionResistance(1200.0F)));
    public static final DeferredBlock<Block> IRON_HEAVY_CORE = registerBlock("iron_heavy_core", (properties) -> new HeavyCoreBlock(properties.mapColor(MapColor.METAL).instrument(NoteBlockInstrument.SNARE).sound(SoundType.HEAVY_CORE).strength(5.0F).pushReaction(PushReaction.NORMAL).explosionResistance(1200.0F)));
    public static final DeferredBlock<Block> GOLDEN_HEAVY_CORE = registerBlock("golden_heavy_core", (properties) -> new HeavyCoreBlock(properties.mapColor(MapColor.METAL).instrument(NoteBlockInstrument.SNARE).sound(SoundType.HEAVY_CORE).strength(3.0F).pushReaction(PushReaction.NORMAL).explosionResistance(1200.0F)));
    public static final DeferredBlock<Block> DIAMOND_HEAVY_CORE = registerBlock("diamond_heavy_core", (properties) -> new HeavyCoreBlock(properties.mapColor(MapColor.METAL).instrument(NoteBlockInstrument.SNARE).sound(SoundType.HEAVY_CORE).strength(5.0F).pushReaction(PushReaction.NORMAL).explosionResistance(1200.0F)));
    public static final DeferredBlock<Block> NETHERITE_HEAVY_CORE = registerBlock("netherite_heavy_core", (properties) -> new HeavyCoreBlock(properties.mapColor(MapColor.METAL).instrument(NoteBlockInstrument.SNARE).sound(SoundType.HEAVY_CORE).strength(50.0F).pushReaction(PushReaction.NORMAL).explosionResistance(1200.0F)));

    public ModBlocks() {
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> func, Supplier<BlockBehaviour.Properties> properties) {
        DeferredBlock<T> block = BLOCKS.registerBlock(name, func, properties);
        return block;
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> func) {
        DeferredBlock<T> block = BLOCKS.registerBlock(name, func);
        return block;
    }

    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }
}
