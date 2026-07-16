package net.kidsplash.alternatemc.client;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.kidsplash.alternatemc.datagen.ModBlockLootTableProvider;
import net.kidsplash.alternatemc.datagen.ModBlockTagsProvider;
import net.kidsplash.alternatemc.datagen.ModModelProvider;

public class AlternateMCDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
	}
}
