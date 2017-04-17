package fi.samip.mod.items.food;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import fi.samip.mod.SamipTest;
import fi.samip.mod.items.ItemModelProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Cooked_Lasagna extends ItemFood implements ItemModelProvider{
	
	public Cooked_Lasagna() {
		super(10, 1.0f, false);
		setUnlocalizedName(Reference.Foods.Cooked_Lasagna.getUnlocalizedName());
		setRegistryName(Reference.Foods.Cooked_Lasagna.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}

	@Override
	public void registerItemModel(Item item) {
		SamipTest.proxy.registerItemRenderer(this, 0, "Cooked_Lasagna");
		
	}

}
