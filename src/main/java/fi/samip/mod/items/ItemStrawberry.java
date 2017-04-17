package fi.samip.mod.items;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
<<<<<<< HEAD
import fi.samip.mod.SamipTest;
=======
import fi.samip.mod.Tutorial;
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
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
	public void initOreDict() {
		OreDictionary.registerOre("cropStrawberry", this);
	}
	
	@Override
	public void registerItemModel(Item item) {
<<<<<<< HEAD
		SamipTest.proxy.registerItemRenderer(this, 0, "strawberry");
=======
		Tutorial.proxy.registerItemRenderer(this, 0, "strawberry");
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
	}

	
}
