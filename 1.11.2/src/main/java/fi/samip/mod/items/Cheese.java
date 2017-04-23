package fi.samip.mod.items;

import fi.samip.mod.SamipFoods;
import fi.samip.mod.init.creativetabs.AllTabs;
import fi.samip.mod.lib.Names;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class Cheese extends ItemFood {
	public Cheese() {
		super(3, 0.6f, false);
		setCreativeTab(AllTabs.SamipFoodsItems);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		
		return SamipFoods.RESOURCE_PREFIX + "item." + Names.Cheese;
		
	}
}
