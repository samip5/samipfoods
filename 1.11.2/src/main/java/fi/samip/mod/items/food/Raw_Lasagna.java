package fi.samip.mod.items.food;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import fi.samip.mod.SamipFoods;
import fi.samip.mod.items.ItemModelProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Raw_Lasagna extends ItemFood implements ItemModelProvider {

	public Raw_Lasagna() {
		super(4, 0.5f, false);
		setUnlocalizedName(Reference.Foods.Raw_Lasagna.getUnlocalizedName());
		setRegistryName(Reference.Foods.Raw_Lasagna.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}
	
	@Override
	public void registerItemModel(Item item) {
		SamipFoods.proxy.registerItemRenderer(this, 0, "rawLasagna");
	}
}
