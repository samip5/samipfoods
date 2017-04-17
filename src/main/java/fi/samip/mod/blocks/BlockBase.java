package fi.samip.mod.blocks;

<<<<<<< HEAD
import fi.samip.mod.SamipTest;
=======
import fi.samip.mod.Tutorial;
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
import fi.samip.mod.items.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements ItemModelProvider {
	
	protected String name;

	public BlockBase(Material material, String name) {
		super(material);

		this.name = name;

		setUnlocalizedName(name);
		setRegistryName(name);
	}

	
	@Override
	public void registerItemModel(Item item) {
<<<<<<< HEAD
		SamipTest.proxy.registerItemRenderer(item, 0, name);
=======
		Tutorial.proxy.registerItemRenderer(item, 0, name);
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
	}

	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
