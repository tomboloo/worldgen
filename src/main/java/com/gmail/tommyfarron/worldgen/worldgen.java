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
		getServer().getPluginManager().registerEvents(new WastelandEventListener(), this);
		getLogger().info("worldgen-0.0.6 has loaded successfully");
	}

	@Override
	public void onDisable() {
		getLogger().info("worldgen-0.0.6 has shut down successfully");
	}

	@Override
	public BiomeProvider getDefaultBiomeProvider(String worldName, String id) { return new WastelandBiomeProvider(); }

	// https://www.spigotmc.org/threads/create-one-biome-worlds.538629/#:~:text=fr3qu3ncy-,Create%20a%20new%20class%20that%20extends%20BiomeProvider,-%2C%20then%20override%20getBiome
	@Override
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) { return new WastelandChunkGenerator(); }

}
