package com.example.demo.teleg.repositories;

import com.example.demo.teleg.entity.City;
import com.example.demo.teleg.entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Integer> {
    List<Weather> findAllByDateAndCity(String date, City city);
    List<Weather> findAllByDateBetweenAndCity(String a, String b, City city);
}
