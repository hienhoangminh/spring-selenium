package com.testing.spring.springselenium.condition;

import com.testing.spring.springselenium.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.testng.annotations.Test;

public class CarTest extends SpringBaseTestNGTest {

    @Qualifier("accord")
    @Autowired
    private Car car;

    @Test
    public void carTest(){
        this.car.run();
    }
}
