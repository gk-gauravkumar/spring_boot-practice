package org.gaurav.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.gaurav.annotations")
public class AppConfig {
//    @Bean
//    public Samsung getPhone(){
//        return new Samsung();
//    }
//    @Bean
//    public MobileProcessors getCpu(){
//        return new Snapdragon();
//    }
}
