package ru.doctorixx;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import ru.doctorixx.events.EventListener;


public class NoVoidPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        initGlobalConfig();
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    private void initGlobalConfig() {
        FileConfiguration config = getConfig();
        long x = config.getLong("spawn-location.x");
        long y = config.getLong("spawn-location.y");
        long z = config.getLong("spawn-location.z");

        Config.getInstance().setPosition(x, y, z);

    }

}
