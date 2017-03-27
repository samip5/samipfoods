package fi.samip.test.items;

import fi.samip.test.InitCreativeTabs;
import fi.samip.test.Reference;
import net.minecraft.item.Item;

public class Lasagna extends Item {

	public Lasagna() {
		setMaxStackSize(64);
		setUnlocalizedName(Reference.TestItems.LASAGNA.getUnlocalizedName());
		setRegistryName(Reference.TestItems.LASAGNA.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}
	
}
