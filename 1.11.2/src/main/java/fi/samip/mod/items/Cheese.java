package fi.samip.mod.items;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import fi.samip.mod.SamipFoods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Cheese extends ItemFood implements ItemModelProvider {
	
	public Cheese() {
		super(3, 0.6f, false);
		setUnlocalizedName(Reference.TestItems.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.TestItems.CHEESE.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}

	@Override
	public void registerItemModel(Item item) {
		SamipFoods.proxy.registerItemRenderer(this, 0, "cheese");
	}
}
