package fi.samip.mod.items.food;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import net.minecraft.item.ItemFood;

public class Raw_Lasagna extends ItemFood {

	public Raw_Lasagna() {
		super(4, 0.5f, false);
		setUnlocalizedName(Reference.Foods.Raw_Lasagna.getUnlocalizedName());
		setRegistryName(Reference.Foods.Raw_Lasagna.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}
	
}
