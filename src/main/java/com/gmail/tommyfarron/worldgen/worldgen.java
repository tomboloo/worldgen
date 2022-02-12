package com.gmail.tommyfarron.worldgen;

import org.bukkit.block.Biome;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public final class worldgen extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("worldgen-0.0.6 has loaded successfully");
		
		}
	
	@Override
	public void onDisable() {
		getLogger().info("worldgen-0.0.6 has shut down successfully");
		
	}

	@Override
	public BiomeProvider getDefaultBiomeProvider(String worldName, String id) { return new WastelandBiomeProvider(); }

	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
		return new CustomChunkGeneratorr();
	}

}
