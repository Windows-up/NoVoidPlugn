package ru.doctorixx.events.handlers;


import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityDamageEvent;
import ru.doctorixx.Config;
import ru.doctorixx.events.EventHandler;

public class OnEntityDamagedHandler implements EventHandler<EntityDamageEvent> {


    @Override
    public void process(EntityDamageEvent event) {
        if (event.getEntityType() != EntityType.PLAYER) return;

        Entity entity = event.getEntity();

        Config config = Config.getInstance();

        Location location = entity.getLocation();
        if (location.getY() <= 0) {
            entity.teleport(new Location(
                    location.getWorld(),
                    config.getX(),
                    config.getY(),
                    config.getZ()
            ));
        }

        event.setCancelled(true);
    }
}
