package fi.samip.mod.init.creativetabs;

import fi.samip.mod.init.BlockLedger;
import fi.samip.mod.init.ItemLedger;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class AllTabs {

	public static final CreativeTabs SamipFoodsBlocks = new CreativeTabs("SamipFoodsBlocks") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(BlockLedger.cheeseBlock);
		}
	};
	
	public static final CreativeTabs SamipFoodsItems = new CreativeTabs("SamipFoodsItems") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemLedger.cheese);
		}
	};
}
