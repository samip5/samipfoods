package fi.samip.mod.items;

import fi.samip.mod.SamipFoods;
import fi.samip.mod.lib.Names;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class Cracker extends ItemFood {	
		
		public Cracker() {
			super(3, 0.6f, false);
			setCreativeTab(SamipFoods.SamipFoodsTab);
		}
		
		@Override
		public String getUnlocalizedName(ItemStack stack) {
			
			return SamipFoods.RESOURCE_PREFIX + Names.Cracker;
			
		}

}
