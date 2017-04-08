package fi.samip.mod.items;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import fi.samip.mod.Tutorial;
import fi.samip.mod.client.TestTab;
import fi.samip.mod.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Cracker extends ItemFood implements ItemModelProvider {	
		
		public Cracker() {
			super(3, 0.6f, false);
			setUnlocalizedName(Reference.TestItems.CRACKER.getUnlocalizedName());
			setRegistryName(Reference.TestItems.CRACKER.getRegistryName());
			setCreativeTab(InitCreativeTabs.TestTab);
		}

		@Override
		public void registerItemModel(Item item) {
			Tutorial.proxy.registerItemRenderer(this, 0, "Cracker");
		}
}
