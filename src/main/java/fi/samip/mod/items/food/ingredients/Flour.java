package fi.samip.mod.items.food.ingredients;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import fi.samip.mod.SamipTest;
import fi.samip.mod.items.ItemModelProvider;
import fi.samip.mod.items.ItemOreDict;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Flour extends Item implements ItemModelProvider{
	
	public Flour() {
		setUnlocalizedName(Reference.Ingredients.Flour.getUnlocalizedName());
		setRegistryName(Reference.Ingredients.Flour.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}

	@Override
	public void registerItemModel(Item item) {
		SamipTest.proxy.registerItemRenderer(this, 0, "flour");
	}

}
