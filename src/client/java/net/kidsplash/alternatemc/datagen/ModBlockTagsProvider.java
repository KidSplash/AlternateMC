package net.kidsplash.alternatemc.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.kidsplash.alternatemc.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(ModBlocks.Cobbled_Basalt));

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.getRK(ModBlocks.Burnt_Wood));

        tag(BlockTags.ANIMALS_SPAWNABLE_ON)
                .add(ModBlocks.getRK(ModBlocks.Volcanic_Soil));

        tag(BlockTags.CONVERTABLE_TO_MUD)
                .add(ModBlocks.getRK(ModBlocks.Volcanic_Soil));

        tag(BlockTags.SUPPORTS_DRY_VEGETATION)
                .add(ModBlocks.getRK(ModBlocks.Volcanic_Soil));

    }
}
