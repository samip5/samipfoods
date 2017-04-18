package fi.samip.mod.creativetabs;

import fi.samip.mod.init.ModBlocks;
import fi.samip.mod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabSamipItems extends CreativeTabs{
	
	public TabSamipItems() {
		super("samipitems");
	}
	
	@Override 
	public ItemStack getTabIconItem() {
	    return new ItemStack(ModItems.cheese);
	}
	public int getItemIconDamage() {
	    return 4;
	}
}
