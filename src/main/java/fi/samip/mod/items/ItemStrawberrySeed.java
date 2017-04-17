package fi.samip.mod.items;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
<<<<<<< HEAD
import fi.samip.mod.SamipTest;
=======
import fi.samip.mod.Tutorial;
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
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
<<<<<<< HEAD
		SamipTest.proxy.registerItemRenderer(item, 0, Reference.TestItems.StrawberrySeed.getRegistryName());
=======
		Tutorial.proxy.registerItemRenderer(item, 0, Reference.TestItems.StrawberrySeed.getRegistryName());
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
	}

}
