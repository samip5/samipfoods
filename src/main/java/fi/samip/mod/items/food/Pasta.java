package fi.samip.mod.items.food;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
<<<<<<< HEAD
import fi.samip.mod.SamipTest;
=======
import fi.samip.mod.Tutorial;
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
import fi.samip.mod.items.ItemModelProvider;
import fi.samip.mod.items.ItemOreDict;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Pasta extends ItemFood implements ItemModelProvider{

		public Pasta() {
			super(3, 0.6f, false);
			setUnlocalizedName(Reference.Foods.PASTA.getRegistryName());
			setRegistryName(Reference.Foods.PASTA.getRegistryName());
			setCreativeTab(InitCreativeTabs.TestTab);
		}

		@Override
		public void registerItemModel(Item item) {
<<<<<<< HEAD
			SamipTest.proxy.registerItemRenderer(this, 0, "pasta");
=======
			Tutorial.proxy.registerItemRenderer(this, 0, "pasta");
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
		}
}
