package com.ray.design.patterns;

import com.ray.design.patterns.strategy.sample1.Discounter;
import com.ray.design.patterns.strategy.sample1.EasterDiscounter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategePattern {
    @Test
    public void stratege() {

        Discounter easterDiscounter = new EasterDiscounter();
        BigDecimal discountedValue = easterDiscounter.applyDiscount(BigDecimal.valueOf(100));
    }
}
