package com.zabzabdoda.emeraldexpansion.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab EMERALDEXPANSION_TAB = new CreativeModeTab("emeraldexpansiontab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.EMERALD_SWORD.get());
        }
    };

}
