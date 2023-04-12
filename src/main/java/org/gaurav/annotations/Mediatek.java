package org.gaurav.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Mediatek implements MobileProcessors {
    @Override
    public void processor() {
        System.out.println("second best cpu");
    }
}
