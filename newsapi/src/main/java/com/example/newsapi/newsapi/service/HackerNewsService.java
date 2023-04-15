package com.example.newsapi.newsapi.service;

import com.example.newsapi.newsapi.entity.Comment;
import com.example.newsapi.newsapi.entity.Story;

import java.util.List;

public interface HackerNewsService {
    List<Story> getTopStories();

    List<Story> getPastStories();

    List<Comment> getCommentsForStory(int storyId);

    void clearCache();

    List<Comment> getComments(Long storyId);
}

