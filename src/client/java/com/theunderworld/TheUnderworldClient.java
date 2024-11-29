package com.theunderworld;

import com.theunderworld.Collections.BlocksCollection;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;

public class TheUnderworldClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		BlockRenderLayerMap.INSTANCE.putBlock(BlocksCollection.DREADWOOD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlocksCollection.DREADWOOD_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlocksCollection.UNDERWORLD_GRASS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlocksCollection.HOLLOW_OAK_LEAVES, RenderLayer.getCutout());

		ColorProviderRegistry.BLOCK.register((state, view, pos, tintindex) -> BiomeColors.getGrassColor(view, pos), BlocksCollection.UNDERWORLD_GRASS);
		ColorProviderRegistry.ITEM.register((stack, tintindex) -> 0x7090cb, BlocksCollection.UNDERWORLD_GRASS);
	}
}