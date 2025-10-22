package net.sharkbaitoooohaha.minecraftendupdate.worldgen.tree;

import net.sharkbaitoooohaha.minecraftendupdate.MinecraftEndUpdate;
import net.sharkbaitoooohaha.minecraftendupdate.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower CREEP = new TreeGrower(MinecraftEndUpdate.MOD_ID + ":creep",
            Optional.empty(), Optional.of(ModConfiguredFeatures.CREEP_KEY), Optional.empty());
    public static final TreeGrower CHORUS = new TreeGrower(MinecraftEndUpdate.MOD_ID + ":chorus",
            Optional.empty(), Optional.of(ModConfiguredFeatures.CHORUS_KEY), Optional.empty());
}
