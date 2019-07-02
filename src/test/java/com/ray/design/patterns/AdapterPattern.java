package com.ray.Design.Patterns;

import com.ray.design.patterns.adapter.BlackMan;
import com.ray.design.patterns.adapter.BlackmanTranslator;
import com.ray.design.patterns.adapter.TaiwanMan;
import com.ray.design.patterns.builder.MacBookSeller;
import com.ray.design.patterns.builder.MacbookPro;
import com.ray.design.patterns.builder.MacbookPro_2018;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdapterPattern {

	@Test
	public void Command() {

		BlackMan blackMan = new BlackMan("black");

		blackMan.helloEnglish();
		blackMan.selfIntroEnglish();


		TaiwanMan taiwanMan = new TaiwanMan(new BlackmanTranslator(blackMan.getName()));

		taiwanMan.hello();
		taiwanMan.selfIntro();

	}
}
