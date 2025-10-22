package net.sharkbaitoooohaha.minecraftendupdate;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.sharkbaitoooohaha.minecraftendupdate.block.ModBlocks;
import net.sharkbaitoooohaha.minecraftendupdate.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MinecraftEndUpdate.MOD_ID)
public class MinecraftEndUpdate {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "minecraftendupdate";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public MinecraftEndUpdate() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.CREEPING_TENDRIL);
            event.accept(ModBlocks.CREEPING_WOOD);
            event.accept(ModBlocks.CREEPING_PLANKS);
            event.accept(ModBlocks.CHORUS_LOG);
            event.accept(ModBlocks.CHORUS_WOOD);
            event.accept(ModBlocks.CHORUS_PLANKS);
            event.accept(ModBlocks.CHISELED_END_BRICK);
            event.accept(ModBlocks.ENDUM_BLOCK);
            event.accept(ModBlocks.OBSIDIAN_BRICK);
            event.accept(ModBlocks.CHISELED_OBSIDIAN_BRICK);
        }

        if(event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(ModBlocks.VOID_TORCH);
            event.accept(ModBlocks.VOID_CAMPFIRE);
            event.accept(ModBlocks.END_ROD_BLOCK);
            event.accept(ModBlocks.RITUAL_TABLE);
        }

        if(event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
            event.accept(ModBlocks.CONSTRUCTOR);
        }

            if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.CREEPING_SPIKE);
            event.accept(ModBlocks.CREEPING_LEAVES);
            event.accept(ModBlocks.CREEPING_ENDINE_BLOCK);
            event.accept(ModBlocks.CREEPING_GRASS);
            event.accept(ModBlocks.REACHING_VINE);
            event.accept(ModBlocks.END_GRASS_BLOCK);
            event.accept(ModBlocks.END_GRASS);
            event.accept(ModBlocks.CHORUS_SAPLING);
            event.accept(ModBlocks.CHORUS_LEAVES);
            event.accept(ModBlocks.END_ROCK);
            event.accept(ModBlocks.END_IRON_ORE);
            event.accept(ModBlocks.CRYSTAL_SAND);
            event.accept(ModBlocks.CRYSTAL_SANDSTONE);
            event.accept(ModBlocks.VOID_BLOCK);
            event.accept(ModBlocks.ENDUM_ORE);
        }

        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.ENDUM_PICKAXE);
            event.accept(ModItems.ENDUM_SHOVEL);
            event.accept(ModItems.ENDUM_AXE);
            event.accept(ModItems.ENDUM_HOE);
        }

        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.ENDUM_SWORD);

            event.accept(ModItems.DRAGON_SCALE_HELMET);
            event.accept(ModItems.DRAGON_SCALE_CHESTPLATE);
            event.accept(ModItems.DRAGON_SCALE_LEGGINGS);
            event.accept(ModItems.DRAGON_SCALE_BOOTS);
        }

        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.RAW_DRAGON);
            event.accept(ModItems.COOKED_DRAGON);
        }

        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.ENDUM_SHARD);
            event.accept(ModItems.ENDUM);
            event.accept(ModItems.DRAGON_SCALE);

            event.accept(ModItems.END_MUSIC_DISC);
            event.accept(ModItems.DRAGON_BANNER_PATTERN);
        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
