package com.greedy.section01.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

	private Pokemon pokemon;
	
	/* 피카츄랑 꼬부기랑 셋이나 있는데 이중에 누구를 autowired 의존성주입해달라는 건지 알 수 없다. 라는 오류가 발생함 */
	@Autowired
	public PokemonService(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public void pokemonAttack() {
		pokemon.attack();
	}
}
