package com.zabzabdoda.emeraldexpansion.item;

import com.zabzabdoda.emeraldexpansion.EmeraldExpansion;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EmeraldExpansion.MOD_ID);

    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword",()-> new SwordItem(Tiers.EMERALD,6,-2.4f,new Item.Properties().tab(ModCreativeModeTab.EMERALDEXPANSION_TAB)));
    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",()-> new PickaxeItem(Tiers.EMERALD,4,-2.8f,new Item.Properties().tab(ModCreativeModeTab.EMERALDEXPANSION_TAB)));
    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",()-> new ShovelItem(Tiers.EMERALD,3.5f,-3f,new Item.Properties().tab(ModCreativeModeTab.EMERALDEXPANSION_TAB)));
    public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe",()-> new HoeItem(Tiers.EMERALD,-1,0,new Item.Properties().tab(ModCreativeModeTab.EMERALDEXPANSION_TAB)));
    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe",()-> new AxeItem(Tiers.EMERALD,8,-3f,new Item.Properties().tab(ModCreativeModeTab.EMERALDEXPANSION_TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots",()-> new ArmorItem(ArmorTiers.EMERALD,EquipmentSlot.FEET,new Item.Properties().tab(ModCreativeModeTab.EMERALDEXPANSION_TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",()-> new ArmorItem(ArmorTiers.EMERALD,EquipmentSlot.LEGS,new Item.Properties().tab(ModCreativeModeTab.EMERALDEXPANSION_TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",()-> new ArmorItem(ArmorTiers.EMERALD,EquipmentSlot.CHEST,new Item.Properties().tab(ModCreativeModeTab.EMERALDEXPANSION_TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet",()-> new ArmorItem(ArmorTiers.EMERALD,EquipmentSlot.HEAD,new Item.Properties().tab(ModCreativeModeTab.EMERALDEXPANSION_TAB)));
    public static final RegistryObject<Item> EMERALD_APPLE = ITEMS.register("emerald_apple",() -> new EmeraldApple(new Item.Properties()));
    //public static final RegistryObject<Item> EMERALD_APPLE = ITEMS.register("emerald_apple",()-> new SimpleFoiledItem(new Item.Properties().tab(ModCreativeModeTab.EMERALDEXPANSION_TAB).food(new FoodProperties.Builder().alwaysEat().effect(()-> new MobEffectInstance(MobEffects.LUCK,600,0),1f).effect(()-> new MobEffectInstance(MobEffects.HEAL,5,1),1f).nutrition(6).build())));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    public static class Tiers{
        public static final Tier EMERALD = new ForgeTier(4,2000,10f,1,25,null,()-> Ingredient.of(Items.EMERALD));
    }

    public static class ArmorTiers {
        public static final ArmorMaterial EMERALD = new ModArmorMaterial("emerald",50,new int[]{4,7,9,4},25, SoundEvents.ARMOR_EQUIP_DIAMOND,2.0f,0.0f,()-> Ingredient.of(Items.EMERALD));
    }


}
