package org.gaurav;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
    @Override
    public void test() {
        System.out.println("bike is working tested ok");

    }
}
