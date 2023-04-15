package com.example.newsapi.newsapi.service;

import com.example.newsapi.newsapi.entity.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryService {
//this service will used to show user stories according to endpoint he has provided
    private static final String TOP_STORIES_ENDPOINT = "/top-stories";
    private static final long CACHE_EXPIRY_TIME = 900000L; // 15 minutes in milliseconds

    @Autowired
    private CacheService cacheService;

    public List<Story> getTopStories() {
        List<Story> stories = null;
        CacheService.CacheEntry cacheEntry = cacheService.getCacheEntry(TOP_STORIES_ENDPOINT);
//if cache entry is not null then add story data into list
        if (cacheEntry != null) {
            stories = (List<Story>) cacheEntry.getData();
        } else {
            // Fetch data from Hacker News API


            // Store data in cache
            cacheService.setCacheEntry(TOP_STORIES_ENDPOINT, stories);
        }

        return stories;
    }

    public List<Story> getPastStories() {
        List<Story> stories = null;
        CacheService.CacheEntry cacheEntry = cacheService.getCacheEntry(TOP_STORIES_ENDPOINT);

        if (cacheEntry != null) {
            stories = (List<Story>) cacheEntry.getData();
        } else {
            throw new RuntimeException("No cache entry found for " + TOP_STORIES_ENDPOINT);
        }

        return stories;
    }

}

