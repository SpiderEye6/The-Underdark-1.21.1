package net.creek.underdark;

import net.creek.underdark.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheUnderdark implements ModInitializer {
	public static final String MOD_ID = "underdark";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// Initializes Underdark Portal.
		CustomPortalBuilder.beginPortal()
				.frameBlock(Blocks.REINFORCED_DEEPSLATE)
				.lightWithItem(Items.OMINOUS_TRIAL_KEY)
				.destDimID(Identifier.of("underdark:the_underdark"))
				.tintColor(0,104,168)
				.onlyLightInOverworld()
				.forcedSize(20, 6)
				.registerPortal();

		// Initializes Modded World Gen.
		ModWorldGeneration.generateModWorldGen();
	}
}