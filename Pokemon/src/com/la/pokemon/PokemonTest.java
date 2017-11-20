package com.la.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		
		Pokedex smoke = new Pokedex("Smoke", 49, "Bulbasaur");
		Pokedex clyde = new Pokedex("Clyde", 39, "Venasaur");
		
		System.out.println(smoke.pokemonInfo(clyde.pokemon));
		smoke.attackPokemon(clyde.pokemon);
		System.out.println(smoke.pokemonInfo(clyde.pokemon));
		
	}

}
