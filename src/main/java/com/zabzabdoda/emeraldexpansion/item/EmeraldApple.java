package com.zabzabdoda.emeraldexpansion.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SimpleFoiledItem;
import net.minecraft.world.level.Level;

public class EmeraldApple extends SimpleFoiledItem {

    public EmeraldApple(Properties properties) {
        super(properties.tab(ModCreativeModeTab.EMERALDEXPANSION_TAB).food(new FoodProperties.Builder().alwaysEat().effect(()-> new MobEffectInstance(MobEffects.LUCK,600,0),1f).nutrition(6).build()));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity livingEntity) {
        livingEntity.heal(6);
        return super.finishUsingItem(itemStack, level, livingEntity);
    }
}