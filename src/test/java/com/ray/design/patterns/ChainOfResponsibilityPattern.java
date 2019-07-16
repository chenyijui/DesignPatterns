package com.ray.design.patterns;

import com.ray.design.patterns.adapter.BlackMan;
import com.ray.design.patterns.adapter.BlackmanTranslator;
import com.ray.design.patterns.adapter.TaiwanMan;
import com.ray.design.patterns.chainOfResponsibility.Handler;
import com.ray.design.patterns.chainOfResponsibility.Manager;
import com.ray.design.patterns.chainOfResponsibility.Trouble;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChainOfResponsibilityPattern {

	@Test
	public void test() {

		Handler manager = new Manager();

//        小問題
		Trouble smallTrouble = new Trouble("想加薪500", 500);

		manager.handleRequest(smallTrouble);

//        大問題
		Trouble bigTrouble = new Trouble("搞壞五十萬的機器",500000);

		manager.handleRequest(bigTrouble);


	}
}
