package com.example.employee.model;

import com.example.employee.service.PokemonConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@JsonApiResource(type = "pokemon")
public class Pokemon {

	@Id
	@JsonApiId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonProperty
	private String name;

//	@JsonProperty
//	@Convert(converter = PokemonConverter.class)
//	private Enum<PokeType> typeOne;
//
//	@JsonProperty
//	@Convert(converter = PokemonConverter.class)
//	private Enum<PokeType> typeTwo;

	@JsonProperty
	private String pokeTypeOne;

	@JsonProperty
	private String pokeTypeTwo;

	@JsonProperty
	private Integer total;

	@JsonProperty
	private Integer hp;

	@JsonProperty
	private Integer attack;

	@JsonProperty
	private Integer defense;

	@JsonProperty
	private Integer special_attack;

	@JsonProperty
	private Integer special_defense;

	@JsonProperty
	private Integer speed;

	@JsonProperty
	private Integer generation;

	@JsonProperty
	private Boolean legendary;

	public void setId(Long id) {
		this.id = id;
	}

	@Id
	public Long getId() {
		return id;
	}
}
