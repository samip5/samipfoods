package fi.samip.mod.proxy;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface CommonProxy {

<<<<<<< HEAD
	public void init(FMLInitializationEvent e);
	public void preInit();
	public void postInit();
=======
	void preInit();
	void init();
	void postInit();
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
	public void registerItemRenderer(Item item, int meta, String id);
	void addRenderRegister(ItemStack stack, ResourceLocation location, String variant);
	
	
}
