package com.ray.design.patterns;

import com.ray.design.patterns.bridge.Bag;
import com.ray.design.patterns.bridge.Book;
import com.ray.design.patterns.bridge.FewView;
import com.ray.design.patterns.bridge.FullView;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BridgePattern {

	@Test
	public void test() {
		FewView fewView = new FewView();
		System.out.println("---- 簡單包包說明 ----");
		fewView.setResources(new Bag());
		fewView.show();
		System.out.println("---- 簡單書本說明 ----");
		fewView.setResources(new Book());
		fewView.show();

		FullView fullView = new FullView();
		System.out.println("---- 詳細包包說明 ----");
		fullView.setResources(new Bag());
		fullView.show();
		System.out.println("---- 詳細書本說明 ----");
		fullView.setResources(new Book());
		fullView.show();

	}
}
