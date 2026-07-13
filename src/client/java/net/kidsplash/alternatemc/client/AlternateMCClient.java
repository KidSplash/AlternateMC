package net.kidsplash.alternatemc.client;

import net.fabricmc.api.ClientModInitializer;
import net.kidsplash.alternatemc.block.ModBlocks;
import net.kidsplash.alternatemc.item.ModItems;

public class AlternateMCClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}