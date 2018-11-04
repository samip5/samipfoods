package fi.samip537.FoodsMod.init;

import net.minecraft.item.Item;

import fi.samip537.FoodsMod.items.ItemBase;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    // Items
    public static final Item SALT = new ItemBase("salt");
    public static final Item FLOUR = new ItemBase("flour");
    public static final Item PASTA = new ItemBase("pasta");
    public static final Item CHEESE = new ItemBase("cheese");
    public static final Item CRACKER = new ItemBase("cracker");
    public static final Item CHEESECRACKER = new ItemBase("cheesecracker");
    public static final Item RAW_LASAGNA = new ItemBase("raw_lasagna");

}
