package net.sharkbaitoooohaha.minecraftendupdate.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties RAW_DRAGON = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 400), 0.20f).build();
    public static final FoodProperties COOKED_DRAGON = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 400), 0.20f).build();
}
