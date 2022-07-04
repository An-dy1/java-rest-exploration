package com.example.employee.repository.restaurant;

import com.example.employee.model.restaurant.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantJpaRepository extends JpaRepository<Restaurant, Long> {
}
