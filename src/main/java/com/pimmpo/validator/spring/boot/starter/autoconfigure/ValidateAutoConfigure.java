package com.pimmpo.validator.spring.boot.starter.autoconfigure;

import com.pimmpo.validator.spring.boot.starter.aspect.ValidateHandlerAspect;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class ValidateAutoConfigure {

    @Bean
    public ValidateHandlerAspect validateHandlerAspect() {
        return new ValidateHandlerAspect();
    }
}
