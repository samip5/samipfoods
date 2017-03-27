package fi.samip.test.items;

import fi.samip.test.InitCreativeTabs;
import fi.samip.test.Reference;
import fi.samip.test.Tutorial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public class ItemStrawberry extends ItemFood implements ItemModelProvider, ItemOreDict {

	public ItemStrawberry() {
		super(3, 0.6f, false);
		setUnlocalizedName(Reference.TestItems.Strawberry.getUnlocalizedName());
		setRegistryName(Reference.TestItems.Strawberry.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}

	@Override
	public void registerItemModel(Item item) {
		Tutorial.proxy.registerItemRenderer(this, 0, "strawberry");
	}

	@Override
	public void initOreDict() {
		OreDictionary.registerOre("cropStrawberry", this);
	}
}
