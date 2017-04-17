package fi.samip.mod.items;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
<<<<<<< HEAD
import fi.samip.mod.SamipTest;
=======
import fi.samip.mod.Tutorial;
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Cheese extends ItemFood implements ItemModelProvider {
	
	public Cheese() {
		super(3, 0.6f, false);
		setUnlocalizedName(Reference.TestItems.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.TestItems.CHEESE.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}

	@Override
	public void registerItemModel(Item item) {
<<<<<<< HEAD
		SamipTest.proxy.registerItemRenderer(this, 0, "cheese");
=======
		Tutorial.proxy.registerItemRenderer(this, 0, "cheese");
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
	}
}
