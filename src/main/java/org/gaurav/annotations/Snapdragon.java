package org.gaurav.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Snapdragon implements MobileProcessors{
    @Override
    public void processor() {
        System.out.println("this is best cpu");
    }
}
