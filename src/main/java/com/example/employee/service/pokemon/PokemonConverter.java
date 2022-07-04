package com.example.employee.service.pokemon;

import com.example.employee.model.pokemon.PokeType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class PokemonConverter implements AttributeConverter<PokeType, String> {

	@Override
	public String convertToDatabaseColumn(PokeType pokeType) {
		return pokeType.getDisplayName();
	}

	@Override
	public PokeType convertToEntityAttribute(String dbData) {
		for (PokeType pokeType : PokeType.values()) {
			if (pokeType.getDisplayName().equals(dbData)) {
				return pokeType;
			}
		}

		throw new IllegalArgumentException("Unknown database value:" + dbData);
	}
}



