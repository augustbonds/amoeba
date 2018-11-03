package com.augustbonds.logserver.logserver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class EventStoreImpl implements EventStore {

    private List<Event> events = new ArrayList<>();

    @Override
    public void log(Event event) {
        assert event != null;

        events.add(event);
    }

    @Override
    public List<Event> events(String type) {
        assert type != null && !type.isEmpty();

        return events.stream().filter(event -> {
            return type.equals(event.getType());
        }).collect(Collectors.toList());
    }

    @Override
    public List<Event> eventsAfter(String type, Date after) {
        assert type != null && !type.isEmpty() && after != null;

        return events.stream()
                .filter(event -> { return type.equals(event.getType()); })
                .filter(event -> {return after.before(event.getTimestamp());}).collect(Collectors.toList());
    }
}
