package com.example.newsapi.newsapi.repository;

import com.example.newsapi.newsapi.entity.Story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface StoryRepository extends JpaRepository<Story,Integer> {
    List<Story> findByTimeGreaterThanEqualOrderByScoreDesc(Date time);

    List<Story> findByTimeLessThanOrderByTimeDesc(Date time);
    /*
     * Designed By PotdarAkshay50
     * */
}
