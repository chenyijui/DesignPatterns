package com.ray.design.patterns.strategy.sample1;

import java.math.BigDecimal;

public interface Discounter {
    BigDecimal applyDiscount(BigDecimal amount);
}
