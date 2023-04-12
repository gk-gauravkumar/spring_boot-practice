package org.gaurav;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    @Autowired
    private Tyre tyre;
    public Tyre getTyre() {
        return tyre;
    }
    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
    @Override
    public void test() {
        System.out.println("car is working tested ok"+tyre);
    }
}
