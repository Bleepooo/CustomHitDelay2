package dev.bleepo.customhitdelay;

import dev.bleepo.customhitdelay.listeners.OnDamage;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main getPlugin() {
        return getPlugin(Main.class);
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new OnDamage(), this);
        saveDefaultConfig();
    }
}
