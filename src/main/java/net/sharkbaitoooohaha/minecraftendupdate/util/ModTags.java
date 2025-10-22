package net.sharkbaitoooohaha.minecraftendupdate.util;

import net.sharkbaitoooohaha.minecraftendupdate.MinecraftEndUpdate;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_ENDUM_TOOL = createTag("needs_endum_tool");
        public static final TagKey<Block> INCORRECT_FOR_ENDUM_TOOL = createTag("incorrect_for_endum_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MinecraftEndUpdate.MOD_ID, name));
        }
    }
}
