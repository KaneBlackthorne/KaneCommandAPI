package org.kane.kcm;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class KaneCommandAPI extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("ChainedTogetherMC has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("ChainedTogetherMC has been disabled!");
    }
}