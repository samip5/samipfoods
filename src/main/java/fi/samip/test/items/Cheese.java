package fi.samip.test.items;

import fi.samip.test.InitCreativeTabs;
import fi.samip.test.Reference;
import net.minecraft.item.Item;

public class Cheese extends Item {
	
	public Cheese() {
		setMaxStackSize(64);
		setUnlocalizedName(Reference.TestItems.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.TestItems.CHEESE.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}
}
