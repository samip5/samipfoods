package fi.samip.mod.items;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import fi.samip.mod.SamipFoods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public class ItemStrawberry extends ItemFood implements ItemOreDict {

	public ItemStrawberry() {
		super(3, 0.6f, false);
		setUnlocalizedName(Reference.TestItems.Strawberry.getUnlocalizedName());
		setRegistryName(Reference.TestItems.Strawberry.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
		
	}

	@Override
	public void initOreDict() {
		OreDictionary.registerOre("cropStrawberry", this);
	}

}
