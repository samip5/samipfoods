package fi.samip.mod.items;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import fi.samip.mod.SamipFoods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class CheeseCracker  extends ItemFood {

	public CheeseCracker() {
		super(3, 0.6f, false);
		setUnlocalizedName(Reference.TestItems.CHEESECRACKER.getUnlocalizedName());
		setRegistryName(Reference.TestItems.CHEESECRACKER.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}
	
}
