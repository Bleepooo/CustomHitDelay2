package dev.bleepo.customhitdelay.listeners;

import dev.bleepo.customhitdelay.ConfigManager;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class OnDamage implements Listener, ConfigManager {

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player) {
            Player player = (Player) e.getDamager();
            player.setMaximumNoDamageTicks(plugin.getConfig().getInt("max-ticks"));
            if (e.getEntity() instanceof Monster || e.getEntity() instanceof Animals) {
                player.setMaximumNoDamageTicks(plugin.getConfig().getInt("default-ticks"));
            }
        } else {
            Player player = (Player) e.getDamager();
            player.setMaximumNoDamageTicks(plugin.getConfig().getInt("default-ticks"));
        }
    }
}
