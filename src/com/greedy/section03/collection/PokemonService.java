package com.greedy.section03.collection;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {


	/* 같은 타입의 빈 여러개 주입 받는 방법 */
	
//	/* 1. List 타입으로 주입 
//	 * 	  Bean이름 사전순으로 생성되고 List에도 해당 순서대로 추가되어 주입된다. */
//	private List<Pokemon> pokemonList;
//	
//	@Autowired
//	public PokemonService(List<Pokemon> pokemonList) {
//		this.pokemonList = pokemonList;
//	}
//	
//	public void pokemonAttack() {
//		for(Pokemon pokemon : pokemonList) {
//			pokemon.attack();
//		}
//	}
	
	/* 2. Map 타입으로 주입 */
	private Map<String, Pokemon> pokemonMap;
	
	@Autowired
	public PokemonService(Map<String, Pokemon> pokemonMap) {
		this.pokemonMap = pokemonMap;
	}
	
	public void pokemonAttack() {
		for(String poke: pokemonMap.keySet()) {
			pokemonMap.get(poke).attack(); 
		}
	}
	
}
