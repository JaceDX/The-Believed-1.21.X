package com.jacedx.thebelieved.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.food.FoodProperties;

import static net.minecraft.world.effect.MobEffects.DAMAGE_RESISTANCE;
import static net.minecraft.world.effect.MobEffects.REGENERATION;

public class TheBelievedFoods {
    public static final FoodProperties MINECHOKE_CHERRY = new FoodProperties.Builder()
            .nutrition(5).saturationModifier(1f)
            .effect(new MobEffectInstance(REGENERATION, 2000),1f)
            .effect(new MobEffectInstance(DAMAGE_RESISTANCE, 2000),1f).build();


}
