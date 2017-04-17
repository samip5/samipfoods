package fi.samip.mod.items;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
<<<<<<< HEAD
import fi.samip.mod.SamipTest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class CheeseCracker  extends ItemFood implements ItemModelProvider {
=======
import fi.samip.mod.Tutorial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class CheeseCracker  extends ItemFood implements ItemModelProvider, ItemOreDict{
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244

	public CheeseCracker() {
		super(3, 0.6f, false);
		setUnlocalizedName(Reference.TestItems.CHEESECRACKER.getUnlocalizedName());
		setRegistryName(Reference.TestItems.CHEESECRACKER.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}

	@Override
<<<<<<< HEAD
	public void registerItemModel(Item item) {
		SamipTest.proxy.registerItemRenderer(this, 0, "cheeseCracker");
=======
	public void initOreDict() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerItemModel(Item item) {
		Tutorial.proxy.registerItemRenderer(this, 0, "cheeseCracker");
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
		
	}
}
