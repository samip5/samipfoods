package fi.samip.mod.handlers;

import java.util.Random;

import fi.samip.mod.api.SamipFoodsConfig.general;
import fi.samip.mod.worldgen.SaltGen;
import net.minecraft.client.multiplayer.ChunkProviderClient;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class GenHandler implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
			for(int i = 0; i < general.saltPerChunk; i++) {
				int randPosX = (chunkX*16) + random.nextInt(16) + 8;
				int randPosZ = (chunkZ*16) + random.nextInt(16) + 8;
				BlockPos pos = world.getTopSolidOrLiquidBlock(new BlockPos(randPosX, 60, randPosZ));
				new SaltGen(6).generate(world, random, pos);
			}
		}
}
