//package com.example.employee.controller;
//
//import com.example.employee.model.Restaurant;
//import com.example.employee.service.RestaurantService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/restaurant")
//public class RestaurantController {
//
//	@Autowired
//	RestaurantService restaurantService;
//
//	@PostMapping()
//	public Restaurant createRestaurant(@RequestBody Restaurant resto) {
//		return restaurantService.createRestaurant(resto);
//	}
//
//	@GetMapping()
//	public List<Restaurant> readRestaurants() {
//		return restaurantService.getRestaurants();
//	}
//
//	@GetMapping("/{restoId}")
//	public Optional<Restaurant> getRestoById(@PathVariable(value = "restoId") Long id) {
//		return restaurantService.getRestoById(id);
//	}
//
////	@RequestMapping(value="/{restoId}", method=RequestMethod.PUT)
////	public Restaurant readRestaurants(@PathVariable(value = "restoId") Long id, @RequestBody Restaurant resto) {
////		return restaurantService.
////	}
////
////	@RequestMapping(value="/employees/{empId}", method=RequestMethod.DELETE)
////	public void deleteEmployees(@PathVariable(value = "empId") Long id) {
////		employeeService.deleteEmployee(id);
////	}
//}
