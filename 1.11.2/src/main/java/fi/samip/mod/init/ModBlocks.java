package fi.samip.mod.init;

import fi.samip.mod.SamipFoods;
import fi.samip.mod.blocks.BlockTinOre;
import fi.samip.mod.blocks.CheeseBlock;
import fi.samip.mod.blocks.SaltBlock;
import fi.samip.mod.blocks.growables.BlockCropStrawberry;
import fi.samip.mod.lib.Names;
import fi.samip.mod.util.ModUtil;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

	public static BlockCropStrawberry cropStrawberry;
	public static SaltBlock saltBlock;
	public static CheeseBlock cheeseBlock;
	public static BlockTinOre tinOre;
	
	
	public static void init() {
		
		ResourceLocation CheeseBlock_location = new ResourceLocation(ModUtil.MOD_ID, Names.CheeseBlock);
		cheeseBlock = new CheeseBlock();
		cheeseBlock.setRegistryName(CheeseBlock_location);
		GameRegistry.register(cheeseBlock);
		GameRegistry.register(new ItemBlock(cheeseBlock), CheeseBlock_location);
		
		ResourceLocation cropStrawberry_location = new ResourceLocation(ModUtil.MOD_ID, Names.cropStrawberry);
		cropStrawberry = new BlockCropStrawberry();
		cropStrawberry.setRegistryName(cropStrawberry_location);
		GameRegistry.register(cropStrawberry);
		GameRegistry.register(new ItemBlock(cropStrawberry), cropStrawberry_location);
		
		ResourceLocation SaltBlock_location = new ResourceLocation(ModUtil.MOD_ID, Names.SaltBlock);
		saltBlock = new SaltBlock();
		saltBlock.setRegistryName(SaltBlock_location);
		GameRegistry.register(saltBlock);
		GameRegistry.register(new ItemBlock(saltBlock), SaltBlock_location);
		
		
		//tinOre = new BlockTinOre();
	}
	
	@SideOnly(Side.CLIENT)
	public static void initTextures(ItemModelMesher mesher) {
		Item cheeseBlock_item = Item.getItemFromBlock(cheeseBlock);
		ModelResourceLocation cheeseBlock_model = new ModelResourceLocation(
				SamipFoods.RESOURCE_PREFIX + Names.CheeseBlock, "inventory");
		ModelLoader.registerItemVariants(cheeseBlock_item, cheeseBlock_model);
		
		Item cropStrawberry_item = Item.getItemFromBlock(cropStrawberry);
		ModelResourceLocation cropStrawberry_model = new ModelResourceLocation(
				SamipFoods.RESOURCE_PREFIX + Names.cropStrawberry, "inventory");
		ModelLoader.registerItemVariants(cropStrawberry_item, cropStrawberry_model);
		
		Item saltBlock_item = Item.getItemFromBlock(saltBlock);
		ModelResourceLocation saltBlock_model = new ModelResourceLocation(
				SamipFoods.RESOURCE_PREFIX + Names.SaltBlock, "inventory");
		ModelLoader.registerItemVariants(saltBlock_item, saltBlock_model);
	}
}
