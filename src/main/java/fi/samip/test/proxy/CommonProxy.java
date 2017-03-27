package fi.samip.test.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface CommonProxy {

	public void init();
	public void registerItemRenderer(Item item, int meta, String id);
}
