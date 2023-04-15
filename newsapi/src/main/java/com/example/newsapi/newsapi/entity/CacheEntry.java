package com.example.newsapi.newsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CacheEntry {
    @Id
    private String endpoint;
    private String data;
    private Long timestamp;

    public CacheEntry(String endpoint, String data, Long timestamp) {
        this.endpoint = endpoint;
        this.data = data;
        this.timestamp = timestamp;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "CacheEntry{" +
                "endpoint='" + endpoint + '\'' +
                ", data='" + data + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
