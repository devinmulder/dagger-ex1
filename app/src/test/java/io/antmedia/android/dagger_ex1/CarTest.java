package io.antmedia.android.dagger_ex1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test1() {

        CarComponent component = DaggerCarComponent.create();

        Car car = component.getCar();
        car.drive();

    }
}