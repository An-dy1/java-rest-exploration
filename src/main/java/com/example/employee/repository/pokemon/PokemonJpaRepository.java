package com.example.employee.repository.pokemon;

import com.example.employee.model.pokemon.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonJpaRepository extends JpaRepository<Pokemon, Long> {
}
