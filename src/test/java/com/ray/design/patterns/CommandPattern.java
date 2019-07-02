package com.ray.Design.Patterns;

import com.ray.design.patterns.command.sample1.*;
import com.ray.design.patterns.command.sample2.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommandPattern {

	@Test
	public void Command() {
		Light light = new Light();

		Command1 turnOn = new TurnOn(light);
		Command1 brighter = new Brighter(light);
		Command1 darker = new Darker(light);

		Invoker invoker = new Invoker();

		invoker.addCommand(turnOn);
		invoker.addCommand(brighter);
		invoker.addCommand(brighter);
		invoker.addCommand(brighter);
		invoker.addCommand(darker);

		invoker.execute();

	}

	@Test
	public void Command2() {
		Tetris tetris = new Tetris();
		ICommandTetris commandLeft = new TurnLeft(tetris);
		ICommandTetris commandRight = new TurnRight(tetris);
		ICommandTetris commandDown= new StraightDown(tetris);

		Invoker2 invoker = new Invoker2(commandLeft);

		invoker.invoke();

		invoker.setCommand(commandRight);

		invoker.invoke();

		invoker.setCommand(commandDown);

		invoker.invoke();

	}

}
