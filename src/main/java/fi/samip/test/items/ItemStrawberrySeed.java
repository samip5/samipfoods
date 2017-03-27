package fi.samip.test.items;

import fi.samip.test.InitCreativeTabs;
import fi.samip.test.Reference;
import fi.samip.test.Tutorial;
import fi.samip.test.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class ItemStrawberrySeed extends ItemSeeds implements ItemModelProvider {

	public ItemStrawberrySeed() {
		super(ModBlocks.cropStrawberry, Blocks.FARMLAND);
		setUnlocalizedName(Reference.TestItems.StrawberrySeed.getUnlocalizedName());
		setRegistryName(Reference.TestItems.StrawberrySeed.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}

	@Override
	public void registerItemModel(Item item) {
		Tutorial.proxy.registerItemRenderer(item, 0, Reference.TestItems.StrawberrySeed.getRegistryName());
	}

}
