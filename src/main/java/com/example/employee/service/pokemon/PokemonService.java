package com.example.employee.service.pokemon;

import com.example.employee.model.pokemon.Pokemon;
import com.example.employee.repository.pokemon.PokemonJpaRepository;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.ResourceList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class PokemonService extends ResourceRepositoryBase<Pokemon, Long> {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(3);

	@Autowired
	PokemonJpaRepository pokemonJpaRepository;

	public PokemonService() {
		super(Pokemon.class
		);
	}

	@Override
	public synchronized ResourceList<Pokemon> findAll(QuerySpec querySpec) {
		return querySpec.apply(pokemonJpaRepository.findAll());
	}

	@Override
	public synchronized void delete(Long id) {
		pokemonJpaRepository.deleteById(id);
	}

	@Override
	public synchronized <S extends Pokemon> S save(S pokemon) {
		if (pokemon.getId() == null) {
			pokemon.setId(ID_GENERATOR.getAndIncrement());
		}
		return pokemonJpaRepository.save(pokemon);
	}


}
