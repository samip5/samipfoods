package fi.samip.test.proxy;

import net.minecraft.item.Item;

public class ServerProxy implements CommonProxy {

	@Override
	public void init() {}
	public void registerItemRenderer(Item item, int meta, String id) {}
}
