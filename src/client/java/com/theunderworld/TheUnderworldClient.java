package com.theunderworld;

import com.theunderworld.Collections.BlocksCollection;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.render.RenderLayer;

public class TheUnderworldClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		BlockRenderLayerMap.INSTANCE.putBlock(BlocksCollection.DREADWOOD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlocksCollection.DREADWOOD_TRAPDOOR, RenderLayer.getCutout());

		ColorProviderRegistry.BLOCK.register((state, view, pos, tintindex) -> 0x3495eb, BlocksCollection.UNDERWORLD_GRASS);
	}
}