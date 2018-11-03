package com.augustbonds.logserver.logserver;

import com.google.common.collect.ImmutableMap;

import java.util.Date;
import java.util.Map;

public final class Event {

    private final Date timestamp;
    private final String type;
    private final Map<String, Object> fields;

    public Event(Date timestamp, String type, Map<String, Object> fields){
        this.timestamp = timestamp;
        this.type = type;
        this.fields = ImmutableMap.copyOf(fields);
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getType() {
        return type;
    }

    public Map<String, Object> getFields() {
        return fields;
    }
}
