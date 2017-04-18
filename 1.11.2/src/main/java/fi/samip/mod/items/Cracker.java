package fi.samip.mod.items;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import fi.samip.mod.SamipFoods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Cracker extends ItemFood {	
		
		public Cracker() {
			super(3, 0.6f, false);
			setUnlocalizedName(Reference.TestItems.CRACKER.getUnlocalizedName());
			setRegistryName(Reference.TestItems.CRACKER.getRegistryName());
			setCreativeTab(InitCreativeTabs.TestTab);
		}

}
