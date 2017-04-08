package fi.samip.mod.items;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import fi.samip.mod.Tutorial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class CheeseCracker  extends ItemFood implements ItemModelProvider, ItemOreDict{

	public CheeseCracker() {
		super(3, 0.6f, false);
		setUnlocalizedName(Reference.TestItems.CHEESECRACKER.getUnlocalizedName());
		setRegistryName(Reference.TestItems.CHEESECRACKER.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}

	@Override
	public void initOreDict() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerItemModel(Item item) {
		Tutorial.proxy.registerItemRenderer(this, 0, "cheeseCracker");
		
	}
}
