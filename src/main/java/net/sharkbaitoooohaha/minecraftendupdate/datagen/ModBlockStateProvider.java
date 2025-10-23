package net.sharkbaitoooohaha.minecraftendupdate.datagen;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.registries.ForgeRegistries;
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
        logBlock(ModBlocks.CREEPING_TENDRIL.get());
        axisBlock(ModBlocks.CREEPING_WOOD.get(), blockTexture(ModBlocks.CREEPING_TENDRIL.get()), blockTexture(ModBlocks.CREEPING_TENDRIL.get()));
        logBlock(ModBlocks.STRIPPED_CREEPING_TENDRIL.get());
        axisBlock(ModBlocks.STRIPPED_CREEPING_WOOD.get(), blockTexture(ModBlocks.STRIPPED_CREEPING_TENDRIL.get()), blockTexture(ModBlocks.STRIPPED_CREEPING_TENDRIL.get()));

        blockItem(ModBlocks.CREEPING_TENDRIL);
        blockItem(ModBlocks.CREEPING_WOOD);
        blockItem(ModBlocks.STRIPPED_CREEPING_TENDRIL);
        blockItem(ModBlocks.STRIPPED_CREEPING_WOOD);

        blockWithItem(ModBlocks.CREEPING_PLANKS);

        leavesBlock(ModBlocks.CREEPING_LEAVES);
        saplingBlock(ModBlocks.CREEPING_SPIKE);

        logBlock(ModBlocks.CHORUS_LOG.get());
        axisBlock(ModBlocks.CHORUS_WOOD.get(), blockTexture(ModBlocks.CHORUS_LOG.get()), blockTexture(ModBlocks.CHORUS_LOG.get()));
        logBlock(ModBlocks.STRIPPED_CHORUS_LOG.get());
        axisBlock(ModBlocks.STRIPPED_CHORUS_WOOD.get(), blockTexture(ModBlocks.STRIPPED_CHORUS_LOG.get()), blockTexture(ModBlocks.STRIPPED_CHORUS_LOG.get()));

        blockItem(ModBlocks.CHORUS_LOG);
        blockItem(ModBlocks.CHORUS_WOOD);
        blockItem(ModBlocks.STRIPPED_CHORUS_LOG);
        blockItem(ModBlocks.STRIPPED_CHORUS_WOOD);

        blockWithItem(ModBlocks.CHORUS_PLANKS);

        leavesBlock(ModBlocks.CHORUS_LEAVES);
        saplingBlock(ModBlocks.CHORUS_SAPLING);

        blockWithItem(ModBlocks.END_ROCK);
        blockWithItem(ModBlocks.CRYSTAL_SAND);
        blockWithItem(ModBlocks.ENDUM_BLOCK);
        blockWithItem(ModBlocks.OBSIDIAN_BRICK);

        blockWithItem(ModBlocks.ENDUM_ORE);
        blockWithItem(ModBlocks.END_IRON_ORE);

    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("minecraftendupdate:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
}
