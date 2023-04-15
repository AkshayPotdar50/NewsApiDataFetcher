package com.example.newsapi.newsapi.service;

import com.example.newsapi.newsapi.entity.CacheEntry;
import com.example.newsapi.newsapi.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private static final long CACHE_EXPIRY_TIME = 900000L; // 15 minutes in milliseconds

    @Autowired
    private CacheService cacheService;
//this method to store comment according to storyId
    public List<Comment> getComments(int storyId) {
        String endpoint = "/stories/" + storyId + "/comments";
        List<Comment> comments = null;
        CacheService.CacheEntry cacheEntry = cacheService.getCacheEntry(endpoint);

        if (cacheEntry != null) {
            comments = (List<Comment>) cacheEntry.getData();
        } else {
            // Fetch data from Hacker News API
            // ...

            // Store data in cache
            cacheService.setCacheEntry(endpoint, comments);
        }

        return comments;
    }

}

