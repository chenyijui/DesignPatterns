package com.ray.design.patterns;

import com.ray.design.patterns.adapter.BlackMan;
import com.ray.design.patterns.adapter.BlackmanTranslator;
import com.ray.design.patterns.adapter.TaiwanMan;
import com.ray.design.patterns.factory.Shape;
import com.ray.design.patterns.factory.ShapeFactory;
import com.ray.design.patterns.factory.abstractFactory.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryPattern {
	@Test
	public void factory() {

		ShapeFactory shapeFactory = new ShapeFactory();

		//get an object of Circle and call its draw method.
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		//call draw method of Circle
		shape1.draw();

		//get an object of Rectangle and call its draw method.
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		//call draw method of Rectangle
		shape2.draw();

		//get an object of Square and call its draw method.
		Shape shape3 = shapeFactory.getShape("SQUARE");

		//call draw method of square
		shape3.draw();

	}
	@Test
	public void abstractfactory() {
		AbstractFactory factorySUV = new SUVFactory();
		System.out.println("----- SUV Factory -----");

		Audi suvAudi = factorySUV.createAudi();
		System.out.println(suvAudi.getBrand() + "的" + suvAudi.getType());

		BMW suvBMW = factorySUV.createBMW();
		System.out.println(suvBMW.getBrand() + "的" + suvBMW.getType());

		AbstractFactory factoryJeep = new JeepFactory();
		System.out.println("----- Jeep Factory -----");

		Audi jeepAudi = factoryJeep.createAudi();
		System.out.println(jeepAudi.getBrand() + "的" + jeepAudi.getType());

		BMW jeepBMW = factoryJeep.createBMW();
		System.out.println(jeepBMW.getBrand() + "的" + jeepBMW.getType());
	}
}
