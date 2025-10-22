package net.sharkbaitoooohaha.minecraftendupdate.item;

import net.minecraft.world.item.*;
import net.sharkbaitoooohaha.minecraftendupdate.MinecraftEndUpdate;
import net.minecraft.network.chat.Component;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftEndUpdate.MOD_ID);

    public static final RegistryObject<Item> ENDUM_SHARD = ITEMS.register("endum_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDUM = ITEMS.register("endum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_SCALE = ITEMS.register("dragon_scale",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDUM_SWORD = ITEMS.register("endum_sword",
            () -> new SwordItem(ModToolTiers.ENDUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ENDUM, 3, -2.4f))));
    public static final RegistryObject<Item> ENDUM_PICKAXE = ITEMS.register("endum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ENDUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ENDUM, 1, -2.8f))));
    public static final RegistryObject<Item> ENDUM_SHOVEL = ITEMS.register("endum_shovel",
            () -> new ShovelItem(ModToolTiers.ENDUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ENDUM, 1.5f, -3.0f))));
    public static final RegistryObject<Item> ENDUM_AXE = ITEMS.register("endum_axe",
            () -> new AxeItem(ModToolTiers.ENDUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ENDUM, 6, -3.2f))));
    public static final RegistryObject<Item> ENDUM_HOE = ITEMS.register("endum_hoe",
            () -> new HoeItem(ModToolTiers.ENDUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ENDUM, 0, -3.0f))));

    public static final RegistryObject<Item> DRAGON_SCALE_HELMET = ITEMS.register("dragon_scale_helmet",
            () -> new ArmorItem(ModArmorMaterials.DRAGON_SCALE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));
    public static final RegistryObject<Item> DRAGON_SCALE_CHESTPLATE = ITEMS.register("dragon_scale_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DRAGON_SCALE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));
    public static final RegistryObject<Item> DRAGON_SCALE_LEGGINGS = ITEMS.register("dragon_scale_leggings",
            () -> new ArmorItem(ModArmorMaterials.DRAGON_SCALE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));
    public static final RegistryObject<Item> DRAGON_SCALE_BOOTS = ITEMS.register("dragon_scale_boots",
            () -> new ArmorItem(ModArmorMaterials.DRAGON_SCALE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));

    public static final RegistryObject<Item> RAW_DRAGON = ITEMS.register("raw_dragon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_DRAGON)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.minecraftendupdate.raw_dragon"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });
    public static final RegistryObject<Item> COOKED_DRAGON = ITEMS.register("cooked_dragon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_DRAGON)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.minecraftendupdate.cooked_dragon"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> END_MUSIC_DISC = ITEMS.register("end_music_disc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BANNER_PATTERN = ITEMS.register("dragon_banner_pattern",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
