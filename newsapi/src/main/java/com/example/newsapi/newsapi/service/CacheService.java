package com.example.newsapi.newsapi.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CacheService {

    private static final Map<String, CacheEntry> CACHE = new HashMap<>();
//this map will be used to store cache according to endpoint we have provided in controller
    public CacheEntry getCacheEntry(String endpoint) {
        //Method to get entry of cache
        CacheEntry cacheEntry = CACHE.get(endpoint);

        if (cacheEntry != null && !cacheEntry.isExpired()) {
            return cacheEntry;
        } else {
            CACHE.remove(endpoint);
            return null;
        }
    }

    public void setCacheEntry(String endpoint, Object data) {
        //this method will set entry of cache according to endpoint
        CACHE.put(endpoint, new CacheEntry(endpoint, data));
    }

    static class CacheEntry {
//these are custom defined variables
        private static final long CACHE_EXPIRY_TIME = 1500000L;
        private final String endpoint;
        private final Object data;
        private final long timestamp;

        public CacheEntry(String endpoint, Object data) {
            this.endpoint = endpoint;
            this.data = data;
            this.timestamp = System.currentTimeMillis();
        }

        public boolean isExpired() {
            //this method will inform controller that the time we have given is expired
            return (System.currentTimeMillis() - timestamp) > CACHE_EXPIRY_TIME;
        }

        public String getEndpoint() {
            return endpoint;
        } //method to get the endpoint

        public Object getData() {
            return data;
        }  //method to get data of cache

    }

}

