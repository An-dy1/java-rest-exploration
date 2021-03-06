package com.example.employee.service.restaurant;

import com.example.employee.model.restaurant.Restaurant;
import com.example.employee.repository.restaurant.RestaurantJpaRepository;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.ResourceList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class RestaurantService extends ResourceRepositoryBase<Restaurant, Long> {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(3);

	@Autowired
	RestaurantJpaRepository restaurantJpaRepository;

	public RestaurantService() {
		super(Restaurant.class);
	}

	@Override
	public synchronized void delete(Long id) {
		restaurantJpaRepository.deleteById(id);
	}

	@Override
	public synchronized <S extends Restaurant> S save(S restaurant) {
		if (restaurant.getId() == null) {
			restaurant.setId(ID_GENERATOR.getAndIncrement());
		}
		return restaurantJpaRepository.save(restaurant);
	}

	@Override
	public synchronized ResourceList<Restaurant> findAll(QuerySpec querySpec) {
		return querySpec.apply(restaurantJpaRepository.findAll());
	}
}
