package org.gaurav;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    private String brand;
//    public Tyre(String brand) {                 //constructor injection
//        this.brand = brand;
//    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {        //setter injection
        this.brand = brand;
    }
    @Override
    public String toString() {
        //return "Tyre{" + "brand='" + brand + '\'' + '}';
        return " with Tyre";
    }
}
