package com.theunderworld.Collections;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.WoodType;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlocksCollection {
    // Hollow Oak Blocks
    public static final Block HOLLOW_OAK_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG));
    public static final Block STRIPPED_HOLLOW_OAK_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG));
    public static final Block HOLLOW_OAK_WOOD = new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD));
    public static final Block STRIPPED_HOLLOW_OAK_WOOD = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD));
    public static final Block HOLLOW_OAK_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS));

    public static final Block HOLLOW_OAK_STAIRS = new StairsBlock(HOLLOW_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS));
    public static final Block HOLLOW_OAK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB));
    public static final Block HOLLOW_OAK_FENCE = new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE));
    public static final Block HOLLOW_OAK_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK);
    public static final Block HOLLOW_OAK_BUTTON = new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK, 30, true);
    public static final Block HOLLOW_OAK_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK);

    public static final Block HOLLOW_OAK_DOOR = new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK);
    public static final Block HOLLOW_OAK_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK);
    
    // Dreadwood Blocks
    public static final Block DREADWOOD_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG));
    public static final Block STRIPPED_DREADWOOD_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG));
    public static final Block DREADWOOD_WOOD = new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD));
    public static final Block STRIPPED_DREADWOOD_WOOD = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD));
    public static final Block DREADWOOD_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS));

    public static final Block DREADWOOD_STAIRS = new StairsBlock(DREADWOOD_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS));
    public static final Block DREADWOOD_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB));
    public static final Block DREADWOOD_FENCE = new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE));
    public static final Block DREADWOOD_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE), WoodType.CHERRY);
    public static final Block DREADWOOD_BUTTON = new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS), BlockSetType.CHERRY, 30, true);
    public static final Block DREADWOOD_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS), BlockSetType.CHERRY);

    public static final Block DREADWOOD_DOOR = new DoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS), BlockSetType.CHERRY);
    public static final Block DREADWOOD_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS), BlockSetType.CHERRY);

    public static void Register(String modID) {
        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_log"), HOLLOW_OAK_LOG);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_log"), new BlockItem(HOLLOW_OAK_LOG, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "stripped_hollow_oak_log"), STRIPPED_HOLLOW_OAK_LOG);
        Registry.register(Registries.ITEM, new Identifier(modID, "stripped_hollow_oak_log"), new BlockItem(STRIPPED_HOLLOW_OAK_LOG, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_wood"), HOLLOW_OAK_WOOD);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_wood"), new BlockItem(HOLLOW_OAK_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "stripped_hollow_oak_wood"), STRIPPED_HOLLOW_OAK_WOOD);
        Registry.register(Registries.ITEM, new Identifier(modID, "stripped_hollow_oak_wood"), new BlockItem(STRIPPED_HOLLOW_OAK_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_planks"), HOLLOW_OAK_PLANKS);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_planks"), new BlockItem(HOLLOW_OAK_PLANKS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_stairs"), HOLLOW_OAK_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_stairs"), new BlockItem(HOLLOW_OAK_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_slab"), HOLLOW_OAK_SLAB);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_slab"), new BlockItem(HOLLOW_OAK_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_fence"), HOLLOW_OAK_FENCE);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_fence"), new BlockItem(HOLLOW_OAK_FENCE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_fence_gate"), HOLLOW_OAK_FENCE_GATE);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_fence_gate"), new BlockItem(HOLLOW_OAK_FENCE_GATE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_button"), HOLLOW_OAK_BUTTON);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_button"), new BlockItem(HOLLOW_OAK_BUTTON, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_pressure_plate"), HOLLOW_OAK_PRESSURE_PLATE);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_pressure_plate"), new BlockItem(HOLLOW_OAK_PRESSURE_PLATE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_door"), HOLLOW_OAK_DOOR);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_door"), new BlockItem(HOLLOW_OAK_DOOR, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_trapdoor"), HOLLOW_OAK_TRAPDOOR);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_trapdoor"), new BlockItem(HOLLOW_OAK_TRAPDOOR, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_log"), DREADWOOD_LOG);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_log"), new BlockItem(DREADWOOD_LOG, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "stripped_dreadwood_log"), STRIPPED_DREADWOOD_LOG);
        Registry.register(Registries.ITEM, new Identifier(modID, "stripped_dreadwood_log"), new BlockItem(STRIPPED_DREADWOOD_LOG, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_wood"), DREADWOOD_WOOD);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_wood"), new BlockItem(DREADWOOD_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "stripped_dreadwood_wood"), STRIPPED_DREADWOOD_WOOD);
        Registry.register(Registries.ITEM, new Identifier(modID, "stripped_dreadwood_wood"), new BlockItem(STRIPPED_DREADWOOD_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_planks"), DREADWOOD_PLANKS);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_planks"), new BlockItem(DREADWOOD_PLANKS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_stairs"), DREADWOOD_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_stairs"), new BlockItem(DREADWOOD_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_slab"), DREADWOOD_SLAB);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_slab"), new BlockItem(DREADWOOD_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_fence"), DREADWOOD_FENCE);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_fence"), new BlockItem(DREADWOOD_FENCE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_fence_gate"), DREADWOOD_FENCE_GATE);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_fence_gate"), new BlockItem(DREADWOOD_FENCE_GATE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_button"), DREADWOOD_BUTTON);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_button"), new BlockItem(DREADWOOD_BUTTON, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_pressure_plate"), DREADWOOD_PRESSURE_PLATE);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_pressure_plate"), new BlockItem(DREADWOOD_PRESSURE_PLATE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_door"), DREADWOOD_DOOR);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_door"), new BlockItem(DREADWOOD_DOOR, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_trapdoor"), DREADWOOD_TRAPDOOR);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_trapdoor"), new BlockItem(DREADWOOD_TRAPDOOR, new FabricItemSettings()));
    }
}
