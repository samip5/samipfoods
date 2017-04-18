package fi.samip.mod.items.food.ingredients;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import net.minecraft.item.Item;

public class Salt extends Item {
	
	public Salt() {
		setUnlocalizedName(Reference.Ingredients.Salt.getUnlocalizedName());
		setRegistryName(Reference.Ingredients.Salt.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}
	
}
