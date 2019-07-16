package com.ray.design.patterns;

import com.ray.design.patterns.builder.MacBookSeller;
import com.ray.design.patterns.builder.MacbookPro;
import com.ray.design.patterns.builder.MacbookPro_2018;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuilderPattern {

	@Test
	public void Command() {

		MacbookPro_2018 macbookPro_2018 = new MacbookPro_2018();

		MacBookSeller macBookSeller = new MacBookSeller(macbookPro_2018);

		//經銷商的固定規格
		MacbookPro myMacbook= macBookSeller.lowSpec();

		System.out.println(myMacbook.toString());

		//想要夢想中的macbook pro需要自己訂製
		MacbookPro dreamMacbook = macbookPro_2018
				.buildCPU(new MacbookPro.Processor("2.9GHz 6 核心第八代 Intel Core i9 處理器"))
				.buildMemory(new MacbookPro.Memory(32))
				.buildStorage(new MacbookPro.Storage(4096))
				.buildKeyboard(new MacbookPro.Keyboard("英文"))
				.buildGraphics(new MacbookPro.Graphics("Radeon Pro 560X 配備 4GB GDDR5 記憶體"))
				.build();

		System.out.println(dreamMacbook.toString());

	}
}
