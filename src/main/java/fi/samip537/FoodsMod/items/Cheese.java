package fi.samip537.FoodsMod.items;

import fi.samip537.FoodsMod.Main;
import fi.samip537.FoodsMod.lib.Names;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class Cheese extends ItemFood {
    public Cheese() {
        super(3, 0.6f, false);
    }

    @Override
    public java.lang.String getUnlocalizedName(ItemStack stack) {
        return Main.RESOURCE_PREFIX + "item." + Names.Cheese;
    }
}
