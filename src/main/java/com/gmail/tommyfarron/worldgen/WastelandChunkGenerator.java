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

	@Override
	public void generateSurface(@NotNull WorldInfo worldInfo, @NotNull Random random, int x, int z, @NotNull ChunkData chunkData) {

		for (int X = 0; X < 16; X++) {
			for (int Z = 0; Z < 16; Z++) {
				for (int y = 20; y < 75; y++) {
					Material currentBlock = chunkData.getBlockData(X, y, Z).getMaterial();
					if (currentBlock == Material.WATER) {
						chunkData.setBlock(X, y, Z, Material.AIR);
					}
					else if (currentBlock == Material.GRAVEL) {
						chunkData.setBlock(X, y, Z, Material.SAND);
					}
					else if (currentBlock == Material.GRANITE) {
						chunkData.setBlock(X, y, Z, Material.SAND);
					}
					else if (currentBlock == Material.ANDESITE) {
						chunkData.setBlock(X, y, Z, Material.SAND);
					}
					else if (currentBlock == Material.DIORITE) {
						chunkData.setBlock(X, y, Z, Material.SAND);
					}
				}
			}
		}
	}

	@Override
	public boolean shouldGenerateNoise() {
		return true;
	}

	@Override
	public boolean shouldGenerateSurface() {
		return true;
	}

	@Override
	public boolean shouldGenerateBedrock() {
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