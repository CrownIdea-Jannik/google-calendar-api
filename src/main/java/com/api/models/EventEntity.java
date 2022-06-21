package com.api.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class EventEntity {
    private String clientId;

    private String start;

    private String end;

    public String getClientId() {
        return clientId;
    }

    public String getEnd() {
        return end;
    }

    public String getStart() {
        return start;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
