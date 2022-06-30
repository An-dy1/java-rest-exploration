package com.example.employee.service;

import com.example.employee.model.Employee;
import com.example.employee.model.Restaurant;
import com.example.employee.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

	@Autowired
	RestaurantRepository restaurantRepository;

	// CREATE
	public Restaurant createRestaurant(Restaurant newRestaurant) {
		return restaurantRepository.save(newRestaurant);
	}

	// READ
	public List<Restaurant> getRestaurants() {
		return restaurantRepository.findAll();
	}

	// UPDATE
//	public Restaurant updateRestaurant(Long restaurantId, Restaurant restaurantDetailss) {
//		Employee employee = restaurantRepository.findById(employeeId).get();
//		employee.setFirstName(employeeDetails.getFirstName());
//		employee.setLastName(employeeDetails.getLastName());
//		employee.setEmailId(employeeDetails.getEmailId());
//
//		return restaurantRepository.save(employee);
//	}

	// DELETE
	public void deleteRestaurant(Long restaurantId) {
		restaurantRepository.deleteById(restaurantId);
	}
}
