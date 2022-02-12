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
        return Biome.ERODED_BADLANDS;
    }

    @Override
    public List<Biome> getBiomes(@NotNull WorldInfo worldInfo) {
        List<Biome> biomes = new ArrayList<Biome>();
        biomes.add(Biome.ERODED_BADLANDS);
        biomes.add(Biome.BADLANDS);
        biomes.add(Biome.DESERT);
        return biomes;
    }
}
