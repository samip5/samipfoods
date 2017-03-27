package fi.samip.test.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import fi.samip.test.Reference;
import fi.samip.test.init.ModBlocks;
import fi.samip.test.init.ModItems;

public class TestTab  extends CreativeTabs{

	public TestTab() {
		super(Reference.MOD_ID);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.cheese;
	}
	
	@Override
	 public boolean hasSearchBar() {
		 return false; // return false if you don't want search bar
	 }
	
	

}
