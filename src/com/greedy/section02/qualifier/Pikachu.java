package com.greedy.section02.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
/* @Primary 어노테이션을 설정하면 @Autowired로 동일한 타입의 여러 빈을 찾게 되는 경우 
 * 자동으로 연결 우선 시 할 타입으로 설정된다. 
 * 동일한 타입의 클래스 중 한 개만 @Primary 어노테이션을 사용할 수 있다. */
@Primary
public class Pikachu implements Pokemon {

	@Override
	public void attack() {
		System.out.println("피카츄의 백만볼트 발사 _~_~_~_~_~_ 파즤직 !");
	}

	
	
}
