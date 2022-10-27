package net.catfishyman.brianquotes;

import net.catfishyman.brianquotes.block.ModBlocks;
import net.catfishyman.brianquotes.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrianQuotes implements ModInitializer {
	public static final String MOD_ID = "brianquotes";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
