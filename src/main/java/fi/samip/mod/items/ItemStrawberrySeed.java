package fi.samip.mod.items;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import fi.samip.mod.Tutorial;
import fi.samip.mod.init.ModBlocks;
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
