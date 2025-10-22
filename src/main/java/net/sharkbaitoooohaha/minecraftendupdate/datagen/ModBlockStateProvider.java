package net.sharkbaitoooohaha.minecraftendupdate.datagen;

import net.sharkbaitoooohaha.minecraftendupdate.MinecraftEndUpdate;
import net.sharkbaitoooohaha.minecraftendupdate.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MinecraftEndUpdate.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.VOID_FIRE);
        blockWithItem(ModBlocks.VOID_TORCH);
        blockWithItem(ModBlocks.VOID_CAMPFIRE);
        blockWithItem(ModBlocks.CREEPING_SPIKE);
        blockWithItem(ModBlocks.CREEPING_TENDRIL);
        blockWithItem(ModBlocks.CREEPING_WOOD);
        blockWithItem(ModBlocks.CREEPING_PLANKS);
        blockWithItem(ModBlocks.CREEPING_LEAVES);
        blockWithItem(ModBlocks.CREEPING_ENDINE_BLOCK);
        blockWithItem(ModBlocks.CREEPING_GRASS);
        blockWithItem(ModBlocks.REACHING_VINE);
        blockWithItem(ModBlocks.END_GRASS_BLOCK);
        blockWithItem(ModBlocks.END_GRASS);
        blockWithItem(ModBlocks.CHORUS_SAPLING);
        blockWithItem(ModBlocks.CHORUS_LOG);
        blockWithItem(ModBlocks.CHORUS_WOOD);
        blockWithItem(ModBlocks.CHORUS_PLANKS);
        blockWithItem(ModBlocks.CHORUS_LEAVES);
        blockWithItem(ModBlocks.END_ROCK);
        blockWithItem(ModBlocks.END_ROD_BLOCK);
        blockWithItem(ModBlocks.CHISELED_END_BRICK);
        blockWithItem(ModBlocks.CRYSTAL_SAND);
        blockWithItem(ModBlocks.CRYSTAL_SANDSTONE);
        blockWithItem(ModBlocks.VOID_BLOCK);
        blockWithItem(ModBlocks.ENDUM_BLOCK);
        blockWithItem(ModBlocks.CONSTRUCTOR);
        blockWithItem(ModBlocks.RITUAL_TABLE);
        blockWithItem(ModBlocks.OBSIDIAN_BRICK);
        blockWithItem(ModBlocks.CHISELED_OBSIDIAN_BRICK);

        blockWithItem(ModBlocks.ENDUM_ORE);
        blockWithItem(ModBlocks.END_IRON_ORE);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
