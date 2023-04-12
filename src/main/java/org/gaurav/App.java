package org.gaurav;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        car car = new car();            car.test();
//        bike bike = new bike();         bike.test();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle obj =  (Vehicle) context.getBean("vehicle");
        obj.test();
    }
}
