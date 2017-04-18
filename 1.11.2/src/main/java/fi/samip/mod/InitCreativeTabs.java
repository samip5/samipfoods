package fi.samip.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class InitCreativeTabs {

	public static final CreativeTabs TestTab = new CreativeTabs("TestTab") {
		@Override 
		public ItemStack getTabIconItem() {
		    return new ItemStack(Items.DIAMOND);
		}
		public int getItemIconDamage() {
		    return 4;
		}
	};
}
