package org.gaurav.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
    @Autowired
    @Qualifier("mediatek")
    MobileProcessors processors;
    public MobileProcessors getProcessors() {
        return processors;
    }
    public void setProcessors(MobileProcessors processors) {
        this.processors = processors;
    }
    public void config(){
        System.out.println("octa core, 8gb ram, 12mp camera ");
        processors.processor();
    }
}
