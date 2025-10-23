package net.sharkbaitoooohaha.minecraftendupdate.item;

import net.minecraft.world.item.Items;
import net.sharkbaitoooohaha.minecraftendupdate.MinecraftEndUpdate;
import net.sharkbaitoooohaha.minecraftendupdate.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinecraftEndUpdate.MOD_ID);

    public static final RegistryObject<CreativeModeTab> END_UPDATE_TAB = CREATIVE_MODE_TABS.register("end_update_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.ENDER_EYE))
                    .title(Component.translatable("creativetab.minecraftendupdate.end_update_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.CREEPING_TENDRIL.get());
                        output.accept(ModBlocks.CREEPING_WOOD.get());
                        output.accept(ModBlocks.CREEPING_PLANKS.get());
                        output.accept(ModBlocks.CHORUS_LOG.get());
                        output.accept(ModBlocks.CHORUS_WOOD.get());
                        output.accept(ModBlocks.CHORUS_PLANKS.get());
                        output.accept(ModBlocks.ENDUM_BLOCK.get());
                        output.accept(ModBlocks.OBSIDIAN_BRICK.get());
                        output.accept(ModBlocks.CREEPING_SPIKE.get());
                        output.accept(ModBlocks.CREEPING_LEAVES.get());
                        output.accept(ModBlocks.CREEPING_ENDINE_BLOCK.get());
                        output.accept(ModBlocks.END_GRASS_BLOCK.get());
                        output.accept(ModBlocks.CHORUS_SAPLING.get());
                        output.accept(ModBlocks.CHORUS_LEAVES.get());
                        output.accept(ModBlocks.END_ROCK.get());
                        output.accept(ModBlocks.END_IRON_ORE.get());
                        output.accept(ModBlocks.CRYSTAL_SAND.get());
                        output.accept(ModBlocks.CRYSTAL_SANDSTONE.get());
                        output.accept(ModBlocks.ENDUM_ORE.get());
                        output.accept(ModItems.ENDUM_PICKAXE.get());
                        output.accept(ModItems.ENDUM_SHOVEL.get());
                        output.accept(ModItems.ENDUM_AXE.get());
                        output.accept(ModItems.ENDUM_HOE.get());
                        output.accept(ModItems.ENDUM_SWORD.get());
                        output.accept(ModItems.DRAGON_SCALE_HELMET.get());
                        output.accept(ModItems.DRAGON_SCALE_CHESTPLATE.get());
                        output.accept(ModItems.DRAGON_SCALE_LEGGINGS.get());
                        output.accept(ModItems.DRAGON_SCALE_BOOTS.get());
                        output.accept(ModItems.RAW_DRAGON.get());
                        output.accept(ModItems.COOKED_DRAGON.get());
                        output.accept(ModItems.ENDUM_SHARD.get());
                        output.accept(ModItems.ENDUM.get());
                        output.accept(ModItems.DRAGON_SCALE.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
