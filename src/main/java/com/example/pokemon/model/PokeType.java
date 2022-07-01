package com.example.pokemon.model;

public enum PokeType {

	GRASS("Grass"),
	POISON("Poison"),
	FIRE("Fire"),
	FLYING("Flying"),
	DRAGON("Dragon"),
	WATER("Water"),
	BUG("Bug"),
	NORMAL("Normal"),
	ELECTRIC("Electric"),
	GROUND("Ground"),
	FAIRY("Fairy"),
	PSYCHIC("Psychic"),
	ROCK("Rock"),
	ICE("Ice"),
	GHOST("Ghose"),
	STEEL("Steel"),
	DARK("Dark"),
	FIGHTING("Fighting");

	private final String displayName;

	PokeType(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}
