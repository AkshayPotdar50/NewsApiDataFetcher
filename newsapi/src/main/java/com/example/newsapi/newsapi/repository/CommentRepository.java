package com.example.newsapi.newsapi.repository;

import com.example.newsapi.newsapi.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;
@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer> {
    List<Comment> findByStoryIdOrderByChildCommentsDesc(int storyId, Pageable pageable);
}
