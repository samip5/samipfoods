package fi.samip.mod.items.food.ingredients;

import fi.samip.mod.SamipFoods;
import fi.samip.mod.lib.Names;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Salt extends Item {
	
	public Salt() {
		setCreativeTab(SamipFoods.SamipFoodsTab);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		
		return SamipFoods.RESOURCE_PREFIX + "item." + Names.Salt;
		
	}
	
}
