package com.ray.design.patterns;

import com.ray.design.patterns.decorator.Circle;
import com.ray.design.patterns.decorator.Rectangle;
import com.ray.design.patterns.decorator.RedShapeDecorator;
import com.ray.design.patterns.decorator.Shape;
import com.ray.design.patterns.flyweight.CustomSetting;
import com.ray.design.patterns.flyweight.Macbook;
import com.ray.design.patterns.flyweight.MacbookFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DecoratorPattern {

	@Test
	public void test() {

		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();

	}
}
