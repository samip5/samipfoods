package fi.samip.mod.items;

import fi.samip.mod.SamipFoods;
import fi.samip.mod.init.creativetabs.AllTabs;
import fi.samip.mod.lib.Names;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemStrawberry extends ItemFood implements ItemOreDict {

	public ItemStrawberry() {
		super(3, 0.6f, false);
		setCreativeTab(AllTabs.SamipFoodsItems);
		
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		
		return SamipFoods.RESOURCE_PREFIX + "item." + Names.Strawberry;
		
	}

	@Override
	public void initOreDict() {
		OreDictionary.registerOre("cropStrawberry", this);
	}

}
