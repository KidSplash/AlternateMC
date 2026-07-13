package net.kidsplash.alternatemc.block;


import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.kidsplash.alternatemc.AlternateMC;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;


public class ModBlocks {

    public static final Block Burnt_Wood = registerBlock("burnt_wood",
            properties -> new Block(properties.strength(4F).sound(SoundType.VINE)));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(AlternateMC.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(AlternateMC.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM,
                Identifier.fromNamespaceAndPath(AlternateMC.MOD_ID, name),
                new BlockItem(block,
                        new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AlternateMC.MOD_ID, name)
                        ))));
    }

    public static void registerModBlocks() {
        AlternateMC.LOGGER.info("Registering Mod Blocks for " + AlternateMC.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(output -> {
            output.accept(Burnt_Wood);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(output -> {
            output.accept(Burnt_Wood);
        });
    }
}
