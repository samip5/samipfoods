package fi.samip.mod.items.food.ingredients;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import net.minecraft.item.Item;

public class Flour extends Item {
	
	public Flour() {
		setUnlocalizedName(Reference.Ingredients.Flour.getUnlocalizedName());
		setRegistryName(Reference.Ingredients.Flour.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}


}
