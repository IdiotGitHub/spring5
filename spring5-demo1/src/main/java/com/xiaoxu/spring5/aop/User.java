package com.xiaoxu.spring5.aop;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
public class User {
    public void add() {
        System.out.println("User add..");
    }
}
