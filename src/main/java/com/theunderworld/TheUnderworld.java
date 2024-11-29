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
			entries.add(BlocksCollection.UNDERWORLD_SOIL);
		})
		.build();

	@Override
	public void onInitialize() {
		// Register Blocks
		LOGGER.info("Registering Blocks!");

		BlocksCollection.Register(modID);

		// Register Item Group
		LOGGER.info("Registering Item Group!");

		Registry.register(Registries.ITEM_GROUP, new Identifier(modID, "the_underworld_group"), THE_UNDERWORLD_GROUP);
	}
}