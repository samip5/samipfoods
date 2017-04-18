package fi.samip.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class InitCreativeTabs {

	public static final CreativeTabs TestTab = new CreativeTabs("TestTab") {
		@Override 
		public Item getTabIconItem() {
		    return Items.DIAMOND;
		}
		public int getItemIconDamage() {
		    return 4;
		}
	};
}
