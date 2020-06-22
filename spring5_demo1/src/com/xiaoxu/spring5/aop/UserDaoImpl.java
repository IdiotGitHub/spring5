package com.xiaoxu.spring5.aop;

public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDao add...");
    }
}
