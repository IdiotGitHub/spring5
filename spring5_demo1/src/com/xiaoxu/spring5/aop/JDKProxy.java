/*
package com.xiaoxu.spring5.aop;

import com.xiaoxu.spring5.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

*/
/**
 * @author Administrator
 *//*

public class JDKProxy {
    public static void main(String[] args) {
        Class[] classes = {UserDao.class};
        UserDao userDao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), classes, new UserDaoHandler(new UserDaoImpl()));
        userDao.add();
    }
}

class UserDaoHandler implements InvocationHandler {
    Object object;

    public UserDaoHandler(Object object) {
        this.object = object;
    }

    */
/**
     * @param proxy
     * @param method 是将要增强的类中的所有的方法，当你执行哪个方法就会增强哪个方法，因此最好要在这个方法中进行方法的判断
     * @param args
     * @return
     * @throws Throwable
     *//*

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //因为会增强所有的方法，因此最好是做一个方法判断
        Object result = null;
        String methodName = method.getName();
        switch (methodName) {
            case "add":
                //方法执行前增强
                System.out.println("方法执行前进行增强，增强的方法名为：" + method.getName());
                //方法执行
                 result = method.invoke(object, args);
                //方法执行后增强
                System.out.println("方法执行后进行增强");
                break;
            case "sub":
                //方法执行前增强
                System.out.println("方法执行前进行增强，增强的方法名为：" + method.getName());
                //方法执行
                result = method.invoke(object, args);
                //方法执行后增强
                System.out.println("方法执行后进行增强");
                break;
            default:
                System.out.println("over");
        }

        return result;
    }
}*/
