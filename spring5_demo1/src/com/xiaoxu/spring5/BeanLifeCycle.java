package com.xiaoxu.spring5;

/**
 * @author Administrator
 */
public class BeanLifeCycle {
    private String hello;

    public BeanLifeCycle() {
        System.out.println("Bean 生命周期第一步，使用无参构造方法创建实例对象");
    }

    public void setHello(String hello) {
        this.hello = hello;
        System.out.println("Bean 生命周期第二部，使用setter方法进行属性注入");
    }
    /**
     * 创建初始化方法，一般用于加载配置项或配置文件
     */
    public void initMethod() {
        System.out.println("Bean 生命周期第三步，调用初始化方法");
    }
    /**
     * 创建销毁方法
     */
    public void destroy() {
        System.out.println("Bean生命周期第五步，调用销毁方法");
    }
}


