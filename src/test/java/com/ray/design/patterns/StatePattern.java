package com.ray.design.patterns;

import com.ray.design.patterns.state.DeliveredState;
import com.ray.design.patterns.state.Package;
import com.ray.design.patterns.adapter.BlackmanTranslator;
import com.ray.design.patterns.adapter.TaiwanMan;
import com.ray.design.patterns.state.OrderedState;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StatePattern {

    @Test
    public void state() {

        Package pkg = new Package();

        pkg.getState();
        pkg.nextState();

        pkg.getState();

        pkg.nextState();

        pkg.getState();
    }

    @Test
    public void moveBack() {
        Package pkg = new Package();
        pkg.setState(new DeliveredState());
        pkg.previousState();
    }

    @Test
    public void stateDemo() {
        Package pkg = new Package();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();
    }
}
