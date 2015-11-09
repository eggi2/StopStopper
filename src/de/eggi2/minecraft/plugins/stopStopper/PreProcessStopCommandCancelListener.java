package de.eggi2.minecraft.plugins.stopStopper;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

/**
 * Created by eggi2 on 09.11.2015.
 *
 * Suppress the stop command
 */
public class PreProcessStopCommandCancelListener implements Listener {


    @EventHandler(priority = EventPriority.NORMAL)
    public void onStopCommand(PlayerCommandPreprocessEvent evt) {
        if (evt.getMessage().startsWith("/stop")) {
            evt.setCancelled(true);
            evt.getPlayer().sendMessage("Stop commands are DISABLED on this server.");
        }
    }


}
