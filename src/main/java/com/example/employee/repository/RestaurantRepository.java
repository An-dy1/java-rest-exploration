package com.example.employee.repository;

import com.example.employee.model.Restaurant;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.ResourceList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class RestaurantRepository extends ResourceRepositoryBase<Restaurant, Long> {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(3);

	@Autowired
	RestaurantJpaRepository restaurantJpaRepository;

	public RestaurantRepository() {
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
