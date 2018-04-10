package fi.samip.mod.items.food;

import fi.samip.mod.SamipFoods;
import fi.samip.mod.init.creativetabs.AllTabs;
import fi.samip.mod.lib.Names;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class Cooked_Lasagna extends ItemFood {
	
	public Cooked_Lasagna() {
		super(10, 1.0f, false);
		setCreativeTab(AllTabs.SamipFoodsItems);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		
		return SamipFoods.RESOURCE_PREFIX + "item." + Names.CookedLasagna;
		
	}

}
