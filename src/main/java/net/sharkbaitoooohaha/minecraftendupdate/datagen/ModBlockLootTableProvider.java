package net.sharkbaitoooohaha.minecraftendupdate.datagen;

import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.sharkbaitoooohaha.minecraftendupdate.block.ModBlocks;
import net.sharkbaitoooohaha.minecraftendupdate.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropOther(ModBlocks.CREEPING_ENDINE_BLOCK.get(), Blocks.END_STONE);
        dropOther(ModBlocks.END_GRASS_BLOCK.get(), Blocks.END_STONE);

        this.dropSelf(ModBlocks.CREEPING_TENDRIL.get());
        this.dropSelf(ModBlocks.CREEPING_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CREEPING_TENDRIL.get());
        this.dropSelf(ModBlocks.STRIPPED_CREEPING_WOOD.get());
        this.dropSelf(ModBlocks.CREEPING_PLANKS.get());
        this.dropSelf(ModBlocks.CREEPING_SPIKE.get());

        this.add(ModBlocks.CREEPING_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.CREEPING_SPIKE.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.CHORUS_LOG.get());
        this.dropSelf(ModBlocks.CHORUS_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CHORUS_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CHORUS_WOOD.get());
        this.dropSelf(ModBlocks.CHORUS_PLANKS.get());
        this.dropSelf(ModBlocks.CHORUS_SAPLING.get());

        this.add(ModBlocks.CHORUS_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.CHORUS_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.END_ROCK.get());
        dropSelf(ModBlocks.CRYSTAL_SAND.get());
        dropSelf(ModBlocks.CRYSTAL_SANDSTONE.get());
        dropSelf(ModBlocks.ENDUM_BLOCK.get());

        dropSelf(ModBlocks.OBSIDIAN_BRICK.get());

        this.add(ModBlocks.ENDUM_ORE.get(),
                block -> createOreDrop(ModBlocks.ENDUM_ORE.get(), ModItems.ENDUM_SHARD.get()));
        this.add(ModBlocks.END_IRON_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.END_IRON_ORE.get(), Items.IRON_NUGGET, 2, 6));
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                pBlock, this.applyExplosionDecay(
                        pBlock, LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
