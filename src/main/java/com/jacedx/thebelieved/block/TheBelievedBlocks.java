package com.jacedx.thebelieved.block;

import com.jacedx.thebelieved.TheBelieved;
import com.jacedx.thebelieved.item.TheBelievedItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class TheBelievedBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TheBelieved.MOD_ID);

    // The Believed Dimension
    public static final RegistryObject<Block> WILD_LOST_STONE = registerBlock("wild_lost_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.STONE).strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WILD_LOST_COVERED_GRASS = registerBlock("wild_lost_covered_grass",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.GRASS).strength(0.5f)));
    public static final RegistryObject<Block> WILD_LOST_DIRT = registerBlock("wild_lost_dirt",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.GRASS).strength(0.5f)));
    public static final RegistryObject<Block> WILD_LOST_LOG = registerBlock("wild_lost_log",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> WILD_LOST_WOOD = registerBlock("wild_lost_wood",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_WILD_LOST_LOG = registerBlock("stripped_wild_lost_log",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_WILD_LOST_WOOD = registerBlock("stripped_wild_lost_wood",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> WILD_LOST_LEAVES = registerBlock("wild_lost_leaves",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.AZALEA_LEAVES).strength(0.2f).requiresCorrectToolForDrops()));

    // Metal / Tech
    public static final RegistryObject<Block> REDSTINITE_CASING = registerBlock("redstinite_casing",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.METAL).strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> REDSTINITE_FRAME = registerBlock("redstinite_frame",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()
                    .sound(SoundType.METAL).strength(3f).requiresCorrectToolForDrops()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> void  registerBlockItem(String name, RegistryObject<T> block) {
        TheBelievedItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }



    public static void register(IEventBus eventBus) {
       BLOCKS.register(eventBus);
    }
}
