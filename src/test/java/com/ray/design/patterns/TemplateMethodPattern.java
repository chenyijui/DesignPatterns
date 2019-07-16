package com.ray.design.patterns;

import com.ray.design.patterns.templatemethod.SoftwareManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TemplateMethodPattern {

	@Test
	public void Command() {

		SoftwareManager softwareManager = new SoftwareManager();

		softwareManager.completeSoftware();

		softwareManager.redoSoftware();

	}
}
