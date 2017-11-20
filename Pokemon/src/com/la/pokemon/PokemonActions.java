package com.la.pokemon;

public interface PokemonActions {
	public void createPokemon(String name, int health, String type);
	public void attackPokemon(Pokemon pokemon);
	public String pokemonInfo(Pokemon pokemon);
}
