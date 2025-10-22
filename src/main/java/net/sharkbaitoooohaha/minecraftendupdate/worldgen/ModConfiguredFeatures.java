package net.sharkbaitoooohaha.minecraftendupdate.worldgen;

import net.sharkbaitoooohaha.minecraftendupdate.MinecraftEndUpdate;
import net.sharkbaitoooohaha.minecraftendupdate.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_IRON_ORE_KEY = registerKey("end_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ENDUM_ORE_KEY = registerKey("endum_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> CREEP_KEY = registerKey("creep");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHORUS_KEY = registerKey("chorus");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        register(context, END_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.END_IRON_ORE.get().defaultBlockState(), 9));
        register(context, ENDUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.ENDUM_ORE.get().defaultBlockState(), 9));

        register(context, CREEP_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CREEPING_TENDRIL.get()),
                new ForkingTrunkPlacer(4, 4, 3),

                BlockStateProvider.simple(ModBlocks.CREEPING_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, CHORUS_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CHORUS_LOG.get()),
                new ForkingTrunkPlacer(4, 4, 3),

                BlockStateProvider.simple(ModBlocks.CHORUS_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MinecraftEndUpdate.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
