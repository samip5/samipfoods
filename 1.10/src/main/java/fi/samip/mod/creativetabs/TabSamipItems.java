package fi.samip.mod.creativetabs;

import fi.samip.mod.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabSamipItems extends CreativeTabs{
	
	public TabSamipItems() {
		super("samipitems");
	}
	
	@Override 
	public Item getTabIconItem() {
	    return Items.DIAMOND;
	}
	public int getItemIconDamage() {
	    return 4;
	}
}
