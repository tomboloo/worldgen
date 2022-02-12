package com.gmail.tommyfarron.worldgen;

import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.generator.WorldInfo;
import org.bukkit.util.noise.SimplexOctaveGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

import static org.bukkit.block.Biome.DESERT;


public class WastelandChunkGenerator extends ChunkGenerator {

//	@Override
//	public void generateNoise(@NotNull WorldInfo worldInfo, @NotNull Random random, int chunkX, int chunkZ, @NotNull ChunkGenerator.ChunkData chunkData) {
//
//		SimplexOctaveGenerator generator = new SimplexOctaveGenerator(new Random(worldInfo.getSeed()), 8);
//		generator.setScale(0.024);
//
//		Material material = Material.TERRACOTTA;
//
//		int worldX = chunkX * 16;
//		int worldZ = chunkZ * 16;
//
//		for (int X = 0; X < 16; X++) {
//			for (int Z = 0; Z < 16; Z++) {
//				double noise = generator.noise(worldX, worldZ, Z, 1, 1, true);
//				int height = (int) (noise * 40);
//				height += 84;
//				if (height > chunkData.getMaxHeight()) {
//					height = chunkData.getMaxHeight();
//				}
//				for (int y = 0; y < height; y++) {
//					chunkData.setBlock(X, y, Z, material);
//				}
//			}
//		}
//	}

//	@Override
//	public void generateBedrock(@NotNull WorldInfo worldInfo, @NotNull Random random, int chunkX, int chunkZ, @NotNull ChunkGenerator.ChunkData chunkData) {
//		if (chunkData.getMinHeight() == worldInfo.getMinHeight()) {
//			for (int x = 0; x < 16; x++) {
//				for (int z = 0; z < 16; z++) {
//					chunkData.setBlock(x, chunkData.getMinHeight(), z, Material.BEDROCK);
//				}
//			}
//		}
//	}

	@Override
	public boolean shouldGenerateSurface() {
		return true;
	}

	@Override
	public boolean shouldGenerateCaves() {
		return true;
	}

	@Override
	public boolean shouldGenerateMobs() {
		return true;
	}

	@Override
	public boolean shouldGenerateDecorations() {
		return true;
	}

	@Override
	public boolean shouldGenerateStructures() {
		return true;
	}
}