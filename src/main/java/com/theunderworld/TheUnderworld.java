package com.theunderworld;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.theunderworld.Collections.BlocksCollection;
import com.theunderworld.Collections.ItemsCollection;

public class TheUnderworld implements ModInitializer {
	public static final String modID = "theunderworld";
	public static final String modName = "The Underworld";
	public static final Logger LOGGER = LoggerFactory.getLogger(modID);

	// Item Group for Modded Content
	private static final ItemGroup THE_UNDERWORLD_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(BlocksCollection.HOLLOW_OAK_LOG))
		.displayName(Text.translatable(modName))
		.entries((context, entries) -> {
			entries.add(BlocksCollection.HOLLOW_OAK_LOG);
			entries.add(BlocksCollection.HOLLOW_OAK_WOOD);
			entries.add(BlocksCollection.STRIPPED_HOLLOW_OAK_LOG);
			entries.add(BlocksCollection.STRIPPED_HOLLOW_OAK_WOOD);
			entries.add(BlocksCollection.HOLLOW_OAK_PLANKS);
			entries.add(BlocksCollection.HOLLOW_OAK_STAIRS);
			entries.add(BlocksCollection.HOLLOW_OAK_SLAB);
			entries.add(BlocksCollection.HOLLOW_OAK_FENCE);
			entries.add(BlocksCollection.HOLLOW_OAK_FENCE_GATE);
			entries.add(BlocksCollection.HOLLOW_OAK_BUTTON);
			entries.add(BlocksCollection.HOLLOW_OAK_PRESSURE_PLATE);
			entries.add(BlocksCollection.HOLLOW_OAK_DOOR);
			entries.add(BlocksCollection.HOLLOW_OAK_TRAPDOOR);
			entries.add(BlocksCollection.DREADWOOD_LOG);
			entries.add(BlocksCollection.DREADWOOD_WOOD);
			entries.add(BlocksCollection.STRIPPED_DREADWOOD_LOG);
			entries.add(BlocksCollection.STRIPPED_DREADWOOD_WOOD);
			entries.add(BlocksCollection.DREADWOOD_PLANKS);
			entries.add(BlocksCollection.DREADWOOD_STAIRS);
			entries.add(BlocksCollection.DREADWOOD_SLAB);
			entries.add(BlocksCollection.DREADWOOD_FENCE);
			entries.add(BlocksCollection.DREADWOOD_FENCE_GATE);
			entries.add(BlocksCollection.DREADWOOD_BUTTON);
			entries.add(BlocksCollection.DREADWOOD_PRESSURE_PLATE);
			entries.add(BlocksCollection.DREADWOOD_DOOR);
			entries.add(BlocksCollection.DREADWOOD_TRAPDOOR);
			entries.add(BlocksCollection.DREADSTONE);
			entries.add(BlocksCollection.DREADSTONE_STAIRS);
			entries.add(BlocksCollection.DREADSTONE_SLAB);
			entries.add(BlocksCollection.DREADSTONE_WALL);
			entries.add(BlocksCollection.COBBLED_DREADSTONE);
			entries.add(BlocksCollection.COBBLED_DREADSTONE_STAIRS);
			entries.add(BlocksCollection.COBBLED_DREADSTONE_SLAB);
			entries.add(BlocksCollection.COBBLED_DREADSTONE_WALL);
			entries.add(BlocksCollection.DREADSTONE_BRICKS);
			entries.add(BlocksCollection.DREADSTONE_BRICK_STAIRS);
			entries.add(BlocksCollection.DREADSTONE_BRICK_SLAB);
			entries.add(BlocksCollection.DREADSTONE_BRICK_WALL);
			entries.add(BlocksCollection.UNDERWORLD_GRASS);
			entries.add(BlocksCollection.UNDERWORLD_SOIL);
			entries.add(BlocksCollection.HOLLOW_OAK_LEAVES);
			entries.add(BlocksCollection.HOLLOW_OAK_SAPLING);
			entries.add(BlocksCollection.DREADWOOD_SHRUB);
			entries.add(BlocksCollection.UNDERWORLD_SAND);
			entries.add(BlocksCollection.UNDERWORLD_SANDSTONE);
			entries.add(BlocksCollection.UNDERWORLD_SANDSTONE_STAIRS);
			entries.add(BlocksCollection.UNDERWORLD_SANDSTONE_SLAB);
			entries.add(BlocksCollection.UNDERWORLD_SANDSTONE_WALL);
			entries.add(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED);
			entries.add(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_STAIRS);
			entries.add(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_SLAB);
			entries.add(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_WALL);
			entries.add(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH);
			entries.add(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_STAIRS);
			entries.add(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_SLAB);
			entries.add(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_WALL);
			entries.add(BlocksCollection.UNDERWORLD_SHRUB);
			entries.add(BlocksCollection.RADIANT_MUSHROOM);
			entries.add(BlocksCollection.DREADSHROOM);
			entries.add(BlocksCollection.OPACITITE_ORE);
			entries.add(ItemsCollection.DREADSTONE_SWORD);
			entries.add(ItemsCollection.DREADSTONE_PICKAXE);
			entries.add(ItemsCollection.DREADSTONE_AXE);
			entries.add(ItemsCollection.DREADSTONE_SHOVEL);
			entries.add(ItemsCollection.DREADSTONE_HOE);
			entries.add(ItemsCollection.RADIANT_DUST);
			entries.add(ItemsCollection.DREADDED_DUST);
			entries.add(ItemsCollection.RAW_OPACITITE);
			entries.add(ItemsCollection.OPACITITE_INGOT);
		})
		.build();

	@Override
	public void onInitialize() {
		// Register Blocks
		LOGGER.info("Registering Blocks!");

		BlocksCollection.Register(modID);

		// Register Items
		LOGGER.info("Registering Items!");

		ItemsCollection.Register(modID);

		// Register Item Group
		LOGGER.info("Registering Item Group!");

		Registry.register(Registries.ITEM_GROUP, new Identifier(modID, "the_underworld_group"), THE_UNDERWORLD_GROUP);
	}
}