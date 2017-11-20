package com.la.pokemon;

public class Pokedex extends AbsPokemon {
	
	public Pokedex(String name, int health, String type) {
		this.createPokemon(name, health, type);
	}
	public String pokemonInfo(Pokemon pokemon) {
		return pokemon.getName() + pokemon.getHealth() + pokemon.getType();
	}
}
