package fi.samip.mod.items;

import fi.samip.mod.SamipFoods;
import fi.samip.mod.init.BlockLedger;
import fi.samip.mod.init.creativetabs.AllTabs;
import fi.samip.mod.lib.Names;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;

public class ItemStrawberrySeed extends ItemSeeds {

	public ItemStrawberrySeed() {
		super(BlockLedger.cropStrawberry, Blocks.FARMLAND);
		setCreativeTab(AllTabs.SamipFoodsItems);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		
		return SamipFoods.RESOURCE_PREFIX + "item." + Names.StrawberrySeed;
		
	}

}
