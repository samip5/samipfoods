package fi.samip.mod.blocks;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
<<<<<<< HEAD
import fi.samip.mod.SamipTest;
=======
import fi.samip.mod.Tutorial;
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
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
<<<<<<< HEAD
		SamipTest.proxy.registerItemRenderer(item, 0, "cheeseBlock");
=======
		Tutorial.proxy.registerItemRenderer(item, 0, "cheeseBlock");
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
		
	}

}
