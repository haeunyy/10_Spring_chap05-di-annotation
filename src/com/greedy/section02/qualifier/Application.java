package com.greedy.section02.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context 
			= new AnnotationConfigApplicationContext("com.greedy.section02.qualifier");
		
		String[] beanName = context.getBeanDefinitionNames();
		for(String bean : beanName) {
			System.out.println(bean);
		}
		
		PokemonService pokemonService = context.getBean("pokemonService",PokemonService.class);
		
		pokemonService.pokemonAttack();
	}
	
}
