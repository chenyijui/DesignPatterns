package com.ray.design.patterns;

import com.ray.design.patterns.memoto.ComputerCareTaker;
import com.ray.design.patterns.memoto.ComputerOriginator;
import com.ray.design.patterns.templatemethod.SoftwareManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemotoPattern {

	@Test
	public void test(){

		ComputerCareTaker careTaker = new ComputerCareTaker();
		ComputerOriginator originator = new ComputerOriginator();

		careTaker.saveMemoto(originator.save());

		System.out.println(careTaker.getSave(0).getSystem());

		originator.setSystem("windows");

		careTaker.saveMemoto(originator.save());

		System.out.println(careTaker.getSave(1).getSystem());

	}
}
