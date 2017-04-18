package fi.samip.mod.items;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import fi.samip.mod.SamipFoods;
import fi.samip.mod.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class ItemStrawberrySeed extends ItemSeeds {

	public ItemStrawberrySeed() {
		super(ModBlocks.cropStrawberry, Blocks.FARMLAND);
		setUnlocalizedName(Reference.TestItems.StrawberrySeed.getUnlocalizedName());
		setRegistryName(Reference.TestItems.StrawberrySeed.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}

}
