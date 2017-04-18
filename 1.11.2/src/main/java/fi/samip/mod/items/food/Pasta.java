package fi.samip.mod.items.food;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import net.minecraft.item.ItemFood;

public class Pasta extends ItemFood {

		public Pasta() {
			super(3, 0.6f, false);
			setUnlocalizedName(Reference.Foods.PASTA.getRegistryName());
			setRegistryName(Reference.Foods.PASTA.getRegistryName());
			setCreativeTab(InitCreativeTabs.TestTab);
		}

}
