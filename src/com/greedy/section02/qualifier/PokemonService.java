package com.greedy.section02.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

	/* @Autowired 만으로는 타입이 동일한 3개의 빈 중 어떤 빈을 선택해야할지 고를 수 없으므로 
	 * @Qualifier 어노테이션으로 빈의 이름을 명시하여 주입할수있다. 
	 * @Qualifier > @Primary 보다 우선된다. */
	
	
	/* 1. 필드 주입 방식 */
//	@Autowired
//	@Qualifier("charmander")
	private Pokemon pokemon;
	
	/* 2. 생성자 주입 방식 */
	@Autowired
	public PokemonService(@Qualifier("squirtle") Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public void pokemonAttack() {
		pokemon.attack();
	}
}
