package com.theunderworld;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.theunderworld.Collections.BlocksCollection;

public class TheUnderworld implements ModInitializer {
	public static final String modID = "the-underworld";
	public static final String modName = "The Underworld";
	public static final Logger LOGGER = LoggerFactory.getLogger(modID);

	@Override
	public void onInitialize() {
		// Register Blocks
		LOGGER.info("Registering Blocks!");

		BlocksCollection.Register(modID);
	}
}