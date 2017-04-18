package fi.samip.mod.items.food.ingredients;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import fi.samip.mod.SamipFoods;
import fi.samip.mod.items.ItemModelProvider;
import net.minecraft.item.Item;

public class Salt extends Item implements ItemModelProvider{
	
	public Salt() {
		setUnlocalizedName(Reference.Ingredients.Salt.getUnlocalizedName());
		setRegistryName(Reference.Ingredients.Salt.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}

	@Override
	public void registerItemModel(Item item) {
		SamipFoods.proxy.registerItemRenderer(this, 0, "salt");
	}
}
