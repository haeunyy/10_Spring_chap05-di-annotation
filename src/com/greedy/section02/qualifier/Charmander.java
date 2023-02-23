package com.greedy.section02.qualifier;

import org.springframework.stereotype.Component;

@Component
public class Charmander implements Pokemon {

	@Override
	public void attack() {
		System.out.println("Charmander 발사 _~_~_~_~_~_ !");
	}

	
	
}
