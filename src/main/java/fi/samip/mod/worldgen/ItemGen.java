package fi.samip.mod.worldgen;

import java.util.Random;

import fi.samip.mod.blocks.SaltBlock;
import fi.samip.mod.init.ModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ItemGen implements IWorldGenerator{

	//world generators
	//private WorldGenerator tin_ore;
	private WorldGenerator salt_block;
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i ++) {
			int x = chunk_X * 16 + rand.nextInt(16);
		        int y = minHeight + rand.nextInt(heightDiff);
		        int z = chunk_Z * 16 + rand.nextInt(16);
		        generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
	
	
	public ItemGen() {
		//tin_ore = new WorldGenMinable(ModBlocks.tinOre.getDefaultState().withProperty(null, null), 4);
		
	}
	
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		
		switch(world.provider.getDimension()) {
		case 0: //overworld
			//this.runGenerator(tin_ore, world, random, chunkX, chunkZ, 20, 60, 64);
			break;
		case 1: //End
			break;
		case -1: //Nether
			break;
		}
		
	}

}
