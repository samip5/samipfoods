package fi.samip.mod.client;

import fi.samip.mod.init.ModItems;
import fi.samip.mod.util.ModUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class TestTab  extends CreativeTabs{
	
	public static final TestTab INSTANCE = new TestTab();

	public TestTab() {
		super(ModUtil.MOD_ID);
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
