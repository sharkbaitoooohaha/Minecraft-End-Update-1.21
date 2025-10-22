package net.sharkbaitoooohaha.minecraftendupdate.datagen;

import net.sharkbaitoooohaha.minecraftendupdate.MinecraftEndUpdate;
import net.sharkbaitoooohaha.minecraftendupdate.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MinecraftEndUpdate.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ENDUM_BLOCK.get())
                .add(ModBlocks.ENDUM_ORE.get())
                .add(ModBlocks.END_IRON_ORE.get())
                .add(ModBlocks.END_ROCK.get())
                .add(ModBlocks.CHISELED_END_BRICK.get())
                .add(ModBlocks.CRYSTAL_SANDSTONE.get())
                .add(ModBlocks.CONSTRUCTOR.get())
                .add(ModBlocks.RITUAL_TABLE.get())
                .add(ModBlocks.OBSIDIAN_BRICK.get())
                .add(ModBlocks.CHISELED_OBSIDIAN_BRICK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RITUAL_TABLE.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.OBSIDIAN_BRICK.get())
                .add(ModBlocks.CHISELED_OBSIDIAN_BRICK.get());
    }
}
