package com.ray.design.patterns;

import com.ray.design.patterns.composite.Component;
import com.ray.design.patterns.composite.Composite;
import com.ray.design.patterns.composite.Leaf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompositePattern {

	@Test
	public void test(){

		Component big = new Composite("大公司");

		Component mid1 = new Composite("子公司1");
		Component mid2 = new Composite("子公司2");

		Component small1 = new Leaf("部門1");
		Component small2 = new Leaf("部門2");
		Component small3 = new Leaf("部門3");
		Component small4 = new Leaf("部門4");

		big.add(mid1);
		big.add(mid2);

		mid1.add(small1);
		mid1.add(small2);

		mid2.add(small3);
		mid2.add(small4);

		Component small5 = new Leaf("部門5");

		small1.add(small5);

		System.out.println("------- 大公司 -------");
//        公司階層
		big.display(1 );
//        大老闆發命令所有人都會接收到
		big.command("開發快一點");

		System.out.println("------- 子公司 -------");

		mid2.display(1 );
//        子公司命令只有子公司下面的階層可以接收到
		mid2.command("大老闆說Q4要完成");

	}

}
