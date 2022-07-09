package com.ShingWong08;

import com.ShingWong08.Commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("Lightning Plugin Enabled!");
        getCommand("lightning").setExecutor(new LightningCommand());
        getCommand("lightning").setTabCompleter(new LightningTapCompletion());
    }

    @Override
    public void onDisable() {
        System.out.println("Lightning Plugin Disabled!");
    }
}