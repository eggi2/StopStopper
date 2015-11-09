package de.eggi2.minecraft.plugins.stopStopper;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.libs.jline.internal.Log;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by eggi2 on 09.11.2015.
 */
public class StopStopper extends JavaPlugin {

    @Override
    public void onEnable() {
        Log.info("Stop command override ENABLED");
        Bukkit.getPluginManager().registerEvents(new PreProcessStopCommandCancelListener(), this);
    }


}
