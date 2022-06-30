package com.example.employee.repository;

import com.example.employee.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantJpaRespository extends JpaRepository<Restaurant, Long> {
}
