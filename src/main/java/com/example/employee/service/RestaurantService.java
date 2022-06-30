//package com.example.employee.service;
//
//import com.example.employee.model.Restaurant;
//import com.example.employee.repository.RestaurantRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class RestaurantService {
//
//	@Autowired
//	RestaurantRepository restaurantRepository;
//
//	// CREATE
//	public Restaurant createRestaurant(Restaurant newRestaurant) {
//		return restaurantRepository.save(newRestaurant);
//	}
//
//	// READ
//	public List<Restaurant> getRestaurants() {
//		return restaurantRepository.findAll();
//	}
//
//	public Optional<Restaurant> getRestoById(Long restoId) {
//		return restaurantRepository.findById(restoId);
//	}
//
//	// UPDATE
////	public Restaurant updateRestaurant(Long restaurantId, Restaurant restaurantDetailss) {
////		Employee employee = restaurantRepository.findById(employeeId).get();
////		employee.setFirstName(employeeDetails.getFirstName());
////		employee.setLastName(employeeDetails.getLastName());
////		employee.setEmailId(employeeDetails.getEmailId());
////
////		return restaurantRepository.save(employee);
////	}
//
//	// DELETE
//	public void deleteRestaurant(Long restaurantId) {
//		restaurantRepository.deleteById(restaurantId);
//	}
//}
