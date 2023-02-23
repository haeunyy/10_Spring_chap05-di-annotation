package com.greedy.section03.collection;

import org.springframework.stereotype.Component;

@Component
public class Charmander implements Pokemon {

	@Override
	public void attack() {
		System.out.println("파이리 발사 _~_~_뽜이야~_~_~_ !");
	}

	
	
}
