package fi.samip.mod.items.food;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import fi.samip.mod.Tutorial;
import fi.samip.mod.items.ItemModelProvider;
import fi.samip.mod.items.ItemOreDict;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ChocolateBar extends ItemFood implements ItemModelProvider {

	public ChocolateBar() {
		super(2, 0.5f, false);
		setUnlocalizedName(Reference.Foods.ChocolateBar.getUnlocalizedName());
		setRegistryName(Reference.Foods.ChocolateBar.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}

	@Override
	public void registerItemModel(Item item) {
		Tutorial.proxy.registerItemRenderer(this, 0, "chocbar");
		
	}
}
