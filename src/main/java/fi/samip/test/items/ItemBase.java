package fi.samip.test.items;

import fi.samip.test.InitCreativeTabs;
import fi.samip.test.client.TestTab;
import fi.samip.test.Reference;
import fi.samip.test.Tutorial;
import fi.samip.test.items.ItemModelProvider;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements ItemModelProvider{

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}

	@Override
	public void registerItemModel(Item item) {
		Tutorial.proxy.registerItemRenderer(item, 0, name);
	}
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
