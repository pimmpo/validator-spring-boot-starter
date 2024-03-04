package com.pimmpo.validator.spring.boot.starter.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
@Slf4j
public class ValidateHandlerAspect {

    //TODO: think about naming we can change to another because it isn't only pointcut
    @Before("@annotation(com.pimmpo.validator.spring.boot.starter.annotation.Validate)")
    public void isValid() {
        log.info("Aspect is working....");
    }

}
