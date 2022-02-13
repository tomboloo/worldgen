package com.gmail.tommyfarron.worldgen;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.world.WorldInitEvent;
import org.bukkit.event.world.WorldLoadEvent;

import static org.bukkit.Bukkit.getLogger;

public class WastelandEventListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.broadcastMessage("Welcome to the WASTELAND " + event.getPlayer().getName() + "!");
    }

    @EventHandler
    public void worldInit(WorldInitEvent event) {
        getLogger().info("[WASTELAND] " + event.getWorld().getName() + " Initialized");
    }

    @EventHandler
    public void worldLoad(WorldLoadEvent event) {
        getLogger().info("[WASTELAND] " + event.getWorld().getName() + " Loaded");
    }
}
