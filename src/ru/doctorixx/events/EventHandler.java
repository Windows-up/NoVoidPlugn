package ru.doctorixx.events;

import org.bukkit.event.Event;

public interface EventHandler<EVENT extends Event> {
    void process(EVENT event);
}
