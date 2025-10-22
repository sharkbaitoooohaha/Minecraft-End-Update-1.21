package net.sharkbaitoooohaha.minecraftendupdate.item;

import net.sharkbaitoooohaha.minecraftendupdate.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier ENDUM = new ForgeTier(1400, 4, 3f, 20,
            ModTags.Blocks.NEEDS_ENDUM_TOOL, () -> Ingredient.of(ModItems.ENDUM.get()),
            ModTags.Blocks.INCORRECT_FOR_ENDUM_TOOL);
}
