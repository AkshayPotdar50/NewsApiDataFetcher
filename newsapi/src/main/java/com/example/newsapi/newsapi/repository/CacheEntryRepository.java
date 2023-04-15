package com.example.newsapi.newsapi.repository;

import com.example.newsapi.newsapi.entity.CacheEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CacheEntryRepository extends JpaRepository<CacheEntry,Integer> {
    Optional<CacheEntry> findByEndpoint(String endpoint);
}
