package com.example.pokemon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokemon {

	@Id
	@JsonApiId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonProperty
	private String name;

	@JsonProperty
	private Enum<PokeType> type_one;

	public void setId(Long id) {
		this.id = id;
	}

	@Id
	public Long getId() {
		return id;
	}
}
