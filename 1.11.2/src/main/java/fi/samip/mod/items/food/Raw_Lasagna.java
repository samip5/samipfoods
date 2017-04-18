package fi.samip.mod.items.food;

import fi.samip.mod.SamipFoods;
import fi.samip.mod.lib.Names;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class Raw_Lasagna extends ItemFood {

	public Raw_Lasagna() {
		super(4, 0.5f, false);
		setCreativeTab(SamipFoods.SamipFoodsTab);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		
		return SamipFoods.RESOURCE_PREFIX + Names.RawLasagna;
		
	}
	
}
