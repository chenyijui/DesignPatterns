package com.ray.design.patterns;
import com.ray.design.patterns.flyweight.CustomSetting;
import com.ray.design.patterns.flyweight.MacbookFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.ray.design.patterns.flyweight.Macbook;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlyweightPattern {

	@Test
	public void test() {
		MacbookFactory factory = new MacbookFactory();

		Macbook goodbook = factory.getMacbook(Macbook.Spec.HIGH);

		System.out.println(goodbook.toString());

		CustomSetting superSetting = new CustomSetting();

		superSetting.setCpu("i9");
		superSetting.setMemory(32);
		superSetting.setStorage(1024);

		Macbook superMacbook = factory.getCustomMacbook(superSetting);

		System.out.println(superMacbook.toString());

	}
}
