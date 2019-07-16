package com.ray.design.patterns;

import com.ray.design.patterns.Iterator.CompanyA;
import com.ray.design.patterns.Iterator.Employee;
import com.ray.design.patterns.Iterator.Iterator;
import com.ray.design.patterns.adapter.BlackMan;
import com.ray.design.patterns.adapter.BlackmanTranslator;
import com.ray.design.patterns.adapter.TaiwanMan;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IteratorPattern {

	@Test
	public void test(){

		CompanyA companyA = new CompanyA();

		Iterator iterator = companyA.CreateIterator();

		while(!iterator.IsDone()){
			System.out.println( ((Employee)iterator.CurrentItem()).name + " : " +  ((Employee)iterator.CurrentItem()).title + " 發薪水囉～");
			iterator.Next();
		}

	}
}
