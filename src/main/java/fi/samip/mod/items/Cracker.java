package fi.samip.mod.items;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
<<<<<<< HEAD
import fi.samip.mod.SamipTest;
=======
import fi.samip.mod.Tutorial;
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
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
<<<<<<< HEAD
			SamipTest.proxy.registerItemRenderer(this, 0, "Cracker");
=======
			Tutorial.proxy.registerItemRenderer(this, 0, "Cracker");
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
		}
}
