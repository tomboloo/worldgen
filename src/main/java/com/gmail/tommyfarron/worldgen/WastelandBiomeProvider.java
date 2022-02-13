package com.gmail.tommyfarron.worldgen;

import org.bukkit.block.Biome;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.WorldInfo;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class WastelandBiomeProvider extends BiomeProvider {
    @Override
    public Biome getBiome(@NotNull WorldInfo worldInfo, int x, int y, int z) {
        if (y > 80) return Biome.BADLANDS;
        else if (y > 70) return Biome.ERODED_BADLANDS;
        else if (y > 30) return Biome.DESERT;
        else if (y > 0) return Biome.LUSH_CAVES;
        else return Biome.DRIPSTONE_CAVES;
    }

    @Override
    public List<Biome> getBiomes(@NotNull WorldInfo worldInfo) {
        List<Biome> biomes = new ArrayList<Biome>();
        biomes.add(Biome.ERODED_BADLANDS);
        biomes.add(Biome.BADLANDS);
        biomes.add(Biome.DESERT);
        biomes.add(Biome.LUSH_CAVES);
        biomes.add(Biome.DRIPSTONE_CAVES);
        return biomes;
    }
}
