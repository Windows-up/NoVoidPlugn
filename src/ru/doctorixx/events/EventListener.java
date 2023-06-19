package ru.doctorixx.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import ru.doctorixx.events.handlers.OnEntityDamagedHandler;

public class EventListener implements Listener {
    @EventHandler
    public void onDamage(EntityDamageEvent event){
        new OnEntityDamagedHandler().process(event);
    }
}
