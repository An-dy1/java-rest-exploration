package com.example.employee.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@JsonApiResource(type = "restaurants")
public class Restaurant {

	@JsonApiId
	private Long id;

	@JsonProperty
	private String name;

	@JsonProperty
	private String address;

	public Restaurant(Long id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
}
