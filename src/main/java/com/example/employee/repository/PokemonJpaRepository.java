package com.example.employee.repository;

import com.example.employee.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonJpaRepository extends JpaRepository<Pokemon, Long> {
}
