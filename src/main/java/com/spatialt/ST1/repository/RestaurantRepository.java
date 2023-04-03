package com.spatialt.ST1.repository;

import com.spatialt.ST1.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    @Query("select r from Restaurant r where r.id = :restaurantId")
    public Optional<Restaurant> findById(@Param("restaurantId") Long id);

}
