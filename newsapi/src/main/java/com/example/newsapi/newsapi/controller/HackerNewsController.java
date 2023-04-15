package com.example.newsapi.newsapi.controller;

import com.example.newsapi.newsapi.entity.Comment;
import com.example.newsapi.newsapi.entity.Story;
import com.example.newsapi.newsapi.service.HackerNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/*
* Designed By PotdarAkshay50
* */
@RestController
public class HackerNewsController {

    @Autowired
    private HackerNewsService hackerNewsService;

    @GetMapping("/top-stories")
    public ResponseEntity<List<Story>> getTopStories() {
        List<Story> stories = hackerNewsService.getTopStories();
        return ResponseEntity.ok(stories);
    }

    @GetMapping("/past-stories")
    public ResponseEntity<List<Story>> getPastStories() {
        List<Story> stories = hackerNewsService.getPastStories();
        return ResponseEntity.ok(stories);
    }

    @GetMapping("/comments")
    public ResponseEntity<List<Comment>> getComments(@RequestParam("storyId") Long storyId) {
        List<Comment> comments = hackerNewsService.getComments(storyId);
        return ResponseEntity.ok(comments);
    }
}
