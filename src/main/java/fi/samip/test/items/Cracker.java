package fi.samip.test.items;

import fi.samip.test.InitCreativeTabs;
import fi.samip.test.Reference;
import fi.samip.test.client.TestTab;
import fi.samip.test.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Cracker extends Item {	
		
		public Cracker() {
			setUnlocalizedName(Reference.TestItems.CRACKER.getUnlocalizedName());
			setRegistryName(Reference.TestItems.CRACKER.getRegistryName());
			setCreativeTab(InitCreativeTabs.TestTab);
		}
}
