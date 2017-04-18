package fi.samip.mod.blocks;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import fi.samip.mod.SamipTest;
import fi.samip.mod.items.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class CheeseBlock extends Block  implements ItemModelProvider{

	public CheeseBlock() {
		super(Material.CAKE);
		setUnlocalizedName(Reference.Blocks.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.Blocks.CHEESE.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}

	@Override
	public void registerItemModel(Item item) {
		SamipTest.proxy.registerItemRenderer(item, 0, "cheeseBlock");
	}

}
