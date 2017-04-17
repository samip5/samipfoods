package fi.samip.mod.items.food.ingredients;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
<<<<<<< HEAD
import fi.samip.mod.SamipTest;
=======
import fi.samip.mod.Tutorial;
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
import fi.samip.mod.items.ItemModelProvider;
import net.minecraft.item.Item;

public class Salt extends Item implements ItemModelProvider{
	
	public Salt() {
		setUnlocalizedName(Reference.Ingredients.Salt.getUnlocalizedName());
		setRegistryName(Reference.Ingredients.Salt.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}

	@Override
	public void registerItemModel(Item item) {
<<<<<<< HEAD
		SamipTest.proxy.registerItemRenderer(this, 0, "salt");
=======
		Tutorial.proxy.registerItemRenderer(this, 0, "salt");
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
	}
}
