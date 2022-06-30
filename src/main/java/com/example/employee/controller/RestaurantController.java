package com.example.employee.controller;

import com.example.employee.model.Restaurant;
import com.example.employee.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

	@Autowired
	RestaurantService restaurantService;

	@PostMapping("/restaurants")
	public Restaurant createRestaurant(@RequestBody Restaurant resto) {
		return restaurantService.createRestaurant(resto);
	}

	@GetMapping("/restaurants")
	public List<Restaurant> readRestaurants() {
		return restaurantService.getRestaurants();
	}
}
