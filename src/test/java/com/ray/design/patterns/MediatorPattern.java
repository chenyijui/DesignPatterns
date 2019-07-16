package com.ray.design.patterns;

import com.ray.design.patterns.adapter.BlackMan;
import com.ray.design.patterns.adapter.BlackmanTranslator;
import com.ray.design.patterns.adapter.TaiwanMan;
import com.ray.design.patterns.mediator.Boss;
import com.ray.design.patterns.mediator.PM;
import com.ray.design.patterns.mediator.Programmer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MediatorPattern {

	@Test
	public void Command() {
//        無名的Boss
		Boss boss = new Boss();

//        各個員工
		PM wei = new PM("小偉");
		Programmer bad = new Programmer("小惡");
		Programmer good = new Programmer("阿仁");

//        把員工加入Boss下面管理
		boss.addMember(wei);
		boss.addMember(bad);
		boss.addMember(good);

//        Boss介紹新來的小惡
		boss.introduce(bad);

//        阿仁自己工作
		good.work();

//        boss請大家專心工作
		boss.workHard();

//        小惡自己做不來
//        PM請老闆幫忙
		wei.bossHelp(bad);


	}
}
