package fr.aurexalium.lave;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Aurexaliumlave extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("Aurexaliumlave active : la propagation de la lave est bloquee.");
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onLavaFlow(BlockFromToEvent event) {
        if (event.getBlock().getType() == Material.LAVA) {
            event.setCancelled(true);
        }
    }
}
