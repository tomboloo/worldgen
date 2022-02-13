package com.gmail.tommyfarron.worldgen;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public final class worldgen extends JavaPlugin {
	@Override
	public void onEnable() {
		// Register Listener
		getServer().getPluginManager().registerEvents(new WastelandEventListener(), this);
		getLogger().info("worldgen-0.0.6 has loaded successfully");
	}

	@Override
	public void onDisable() {
		getLogger().info("worldgen-0.0.6 has shut down successfully");
	}

	// set default biome provider to our own class
	@Override
	public BiomeProvider getDefaultBiomeProvider(String worldName, String id) { return new WastelandBiomeProvider(); }

	// set default world generator to our own class
	@Override
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) { return new WastelandChunkGenerator(); }

}
