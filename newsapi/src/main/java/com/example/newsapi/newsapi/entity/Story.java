package com.example.newsapi.newsapi.entity;

import jakarta.persistence.Entity;
import org.springframework.stereotype.Service;

@Entity
public class Story {
    private String tittle;
    private String url;
    private int score;
    private long timeOfSubmission;
    private String user;

    public Story(String tittle, String url, int score, long timeOfSubmission, String user) {
        this.tittle = tittle;
        this.url = url;
        this.score = score;
        this.timeOfSubmission = timeOfSubmission;
        this.user = user;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public long getTimeOfSubmission() {
        return timeOfSubmission;
    }

    public void setTimeOfSubmission(long timeOfSubmission) {
        this.timeOfSubmission = timeOfSubmission;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Story{" +
                "tittle='" + tittle + '\'' +
                ", url='" + url + '\'' +
                ", score=" + score +
                ", timeOfSubmission=" + timeOfSubmission +
                ", user='" + user + '\'' +
                '}';
    }
}
