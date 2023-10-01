package com.example.demo.teleg.repositories;

import com.example.demo.teleg.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Integer> {
    boolean existsById(Integer id);
    //boolean existsByNewsText(String text);
}
