package fi.samip.mod.items.food;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import net.minecraft.item.ItemFood;

public class Cooked_Lasagna extends ItemFood {
	
	public Cooked_Lasagna() {
		super(10, 1.0f, false);
		setUnlocalizedName(Reference.Foods.Cooked_Lasagna.getUnlocalizedName());
		setRegistryName(Reference.Foods.Cooked_Lasagna.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}

}
