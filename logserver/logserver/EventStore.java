package com.augustbonds.logserver.logserver;

import java.util.Date;
import java.util.List;

public interface EventStore {

    void log(Event event);

    List<Event> events(String type);

    List<Event> eventsAfter(String type, Date after);

}
