package com.xiaoxu.spring5.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
@Aspect
public class UserProxy {
    @Before("execution(* com.xiaoxu.spring5.aop.User.add(..))")
    public void before() {
        System.out.println("before...");
    }
}
