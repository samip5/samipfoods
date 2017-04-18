package fi.samip.mod.items.food;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import net.minecraft.item.ItemFood;

public class ChocolateBar extends ItemFood {

	public ChocolateBar() {
		super(2, 0.5f, false);
		setUnlocalizedName(Reference.Foods.ChocolateBar.getUnlocalizedName());
		setRegistryName(Reference.Foods.ChocolateBar.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}

}
