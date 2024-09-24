package org.kane.kcm;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class KaneCommandAPI extends JavaPlugin implements {

    @Override
    public void onEnable() {
        getLogger().info("KaneCommandAPI in");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("KaneCommandAPI out");
    }
}