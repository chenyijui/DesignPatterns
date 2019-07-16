package com.ray.design.patterns.strategy.sample1;

import java.math.BigDecimal;

public class EasterDiscounter implements Discounter {
    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.5));
    }
}
