package fi.samip.mod.init;

import fi.samip.mod.SamipFoods;
import fi.samip.mod.items.Cheese;
import fi.samip.mod.items.CheeseCracker;
import fi.samip.mod.items.Cracker;
import fi.samip.mod.items.ItemStrawberry;
import fi.samip.mod.items.ItemStrawberrySeed;
import fi.samip.mod.items.food.ChocolateBar;
import fi.samip.mod.items.food.Cooked_Lasagna;
import fi.samip.mod.items.food.Pasta;
import fi.samip.mod.items.food.Raw_Lasagna;
import fi.samip.mod.items.food.ingredients.Flour;
import fi.samip.mod.items.food.ingredients.Salt;
import fi.samip.mod.lib.Names;
import fi.samip.mod.util.ModUtil;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemLedger {
	public static Cheese cheese;
	public static Cracker cracker;
	public static CheeseCracker cheesecracker;
	public static ItemStrawberrySeed strawberrySeed;
	public static ItemStrawberry strawberry;
	public static Pasta Pasta;
	public static Raw_Lasagna Raw_Lasagna;
	public static Cooked_Lasagna Cooked_Lasagna;
	public static ChocolateBar ChocolateBar;
	public static Flour Flour;
	public static Salt Salt;

	public static void registerItems(RegistryEvent.Register<Item> event) {
		cheese = (Cheese)registerItem(event.getRegistry(), new Cheese(), Names.Cheese);
		cracker = (Cracker)registerItem(event.getRegistry(), new Cracker(), Names.Cracker);
		cheesecracker = (CheeseCracker)registerItem(event.getRegistry(), new CheeseCracker(), Names.CheeseCracker);
		strawberrySeed = (ItemStrawberrySeed)registerItem(event.getRegistry(), new ItemStrawberrySeed(), Names.StrawberrySeed);
		strawberry = (ItemStrawberry)registerItem(event.getRegistry(), new ItemStrawberry(), Names.Strawberry);
		Pasta = (Pasta)registerItem(event.getRegistry(), new Pasta(), Names.Pasta);
		Raw_Lasagna = (Raw_Lasagna)registerItem(event.getRegistry(), new Raw_Lasagna(), Names.RawLasagna);
		Cooked_Lasagna = (Cooked_Lasagna)registerItem(event.getRegistry(), new Cooked_Lasagna(), Names.CookedLasagna);
		ChocolateBar = (ChocolateBar)registerItem(event.getRegistry(), new ChocolateBar(), Names.ChocolateBar);
		Flour = (Flour)registerItem(event.getRegistry(), new Flour(), Names.Flour);
		Salt = (Salt)registerItem(event.getRegistry(),new Salt(), Names.Salt);
		
	}
	

	private static Item registerItem(IForgeRegistry<Item> registry, Item newItem, String Name) {
		newItem.setUnlocalizedName(ModUtil.MOD_ID + "." + Name);
		newItem.setRegistryName(ModUtil.MOD_ID, Name);
		registry.register(newItem);
		return newItem;
	}
}
