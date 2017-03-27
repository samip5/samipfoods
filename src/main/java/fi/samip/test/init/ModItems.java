package fi.samip.test.init;

import fi.samip.test.InitCreativeTabs;
import fi.samip.test.items.ItemBase;
import fi.samip.test.items.ItemModelProvider;
import fi.samip.test.items.ItemStrawberry;
import fi.samip.test.items.ItemStrawberrySeed;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	/*public static Item cheese;
	public static Item cracker;
	public static Item cheesecracker;
	
	public static void init() {
		cheese = new ItemCheese();
		cracker = new ItemCracker();
		cheesecracker = new ItemCheeseCracker();
	}

	public static void register() {
		GameRegistry.register(cheese);
		GameRegistry.register(cracker);
		GameRegistry.register(cheesecracker);
	}
	
	public static void registerRenders() {
		registerRender(cheese);
		registerRender(cracker);
		registerRender(cheesecracker);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	} */
	
	public static ItemBase cheese;
	public static ItemBase cracker;
	public static ItemBase cheesecracker;
	public static ItemStrawberrySeed strawberrySeed;
	public static ItemStrawberry strawberry;
	
	
	public static void init() {
		cheese = register(new ItemBase("Cheese").setCreativeTab(InitCreativeTabs.TestTab));
		cracker = register(new ItemBase("Cracker").setCreativeTab(InitCreativeTabs.TestTab));
		cheesecracker = register(new ItemBase("CheeseCracker").setCreativeTab(InitCreativeTabs.TestTab));
		strawberrySeed = register(new ItemStrawberrySeed());
		strawberry = register(new ItemStrawberry());
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}

		return item;
	}
}
