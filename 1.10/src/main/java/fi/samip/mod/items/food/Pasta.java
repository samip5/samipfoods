package fi.samip.mod.items.food;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import fi.samip.mod.SamipTest;
import fi.samip.mod.items.ItemModelProvider;
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
			SamipTest.proxy.registerItemRenderer(this, 0, "pasta");
		}
}
