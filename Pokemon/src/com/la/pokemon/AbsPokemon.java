package com.la.pokemon;

public abstract class AbsPokemon implements PokemonActions {

	public Pokemon pokemon = null;
	
	public void createPokemon(String name, int health, String type) {
		pokemon = new Pokemon(name, health, type);
	}

	public void attackPokemon(Pokemon pokemon) {
		int health = pokemon.getHealth() - 10;
		pokemon.setHealth(health);
	}

	public abstract String pokemonInfo(Pokemon pokemon);
}
