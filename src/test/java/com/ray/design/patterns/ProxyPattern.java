package com.ray.Design.Patterns;

import com.ray.design.patterns.adapter.BlackMan;
import com.ray.design.patterns.adapter.BlackmanTranslator;
import com.ray.design.patterns.adapter.TaiwanMan;
import com.ray.design.patterns.proxy.IBuyDream;
import com.ray.design.patterns.proxy.KoreaFishAgent;
import com.ray.design.patterns.proxy.LittleEngineer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProxyPattern {

	@Test
	public void proxy() {

		IBuyDream littleEngineer = new LittleEngineer();

		IBuyDream koreaFishAgent = new KoreaFishAgent(littleEngineer);

		koreaFishAgent.sell();
		koreaFishAgent.makeMomey();
	}
}
