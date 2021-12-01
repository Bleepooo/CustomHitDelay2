package dev.bleepo.customhitdelay;

import org.bukkit.configuration.file.FileConfiguration;

public interface ConfigManager {
    Main plugin = Main.getPlugin();
    FileConfiguration config = plugin.getConfig();
}
