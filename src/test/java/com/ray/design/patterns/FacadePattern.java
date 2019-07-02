package com.ray.Design.Patterns;

import com.ray.design.patterns.facade.Facade1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadePattern {

	@Test
	public void facade() {

		Facade1 facade = new Facade1();

		System.out.println("MethodA : ");
		facade.MethodA();

		System.out.println("MethodB : ");
		facade.MethodB();

	}
}
