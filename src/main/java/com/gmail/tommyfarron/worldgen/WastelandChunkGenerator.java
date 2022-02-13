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

		for (int X = 0; X < 16; X++) { // For every block in the chunks x direction
			for (int Z = 0; Z < 16; Z++) { // For every block in the chunks z direction
				for (int y = 20; y < 75; y++) { // every block between bottom of ocean and top of desert
					Material currentBlock = chunkData.getBlockData(X, y, Z).getMaterial();
					// Replace water blocks with air blocks
					if (currentBlock == Material.WATER) {
						chunkData.setBlock(X, y, Z, Material.AIR);
					}
					// Replace gravel / granite / andesite / diorite blocks with sand (ocean floor)
					else if (currentBlock == Material.GRAVEL
							|| currentBlock == Material.GRANITE
							|| currentBlock == Material.ANDESITE
							|| currentBlock == Material.DIORITE) {
						chunkData.setBlock(X, y, Z, Material.SAND);
					}
				}
			}
		}
	}

	// Overrides to keep vanilla chunk generation
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