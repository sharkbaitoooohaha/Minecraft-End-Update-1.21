package net.sharkbaitoooohaha.minecraftendupdate.datagen;

import net.minecraft.tags.ItemTags;
import net.sharkbaitoooohaha.minecraftendupdate.MinecraftEndUpdate;
import net.sharkbaitoooohaha.minecraftendupdate.block.ModBlocks;
import net.sharkbaitoooohaha.minecraftendupdate.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                              CompletableFuture<TagLookup<Block>> lookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, lookupCompletableFuture, MinecraftEndUpdate.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.DRAGON_SCALE_HELMET.get())
                .add(ModItems.DRAGON_SCALE_CHESTPLATE.get())
                .add(ModItems.DRAGON_SCALE_LEGGINGS.get())
                .add(ModItems.DRAGON_SCALE_BOOTS.get());

        tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.CHORUS_LOG.get().asItem())
                .add(ModBlocks.CHORUS_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_CHORUS_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_CHORUS_WOOD.get().asItem());

        tag(ItemTags.PLANKS)
                .add(ModBlocks.CREEPING_PLANKS.get().asItem())
                .add(ModBlocks.CHORUS_PLANKS.get().asItem());
    }
}
