package com.xiaoxu.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Administrator
 */
@Configuration
@ComponentScan(basePackages = {"com.xiaoxu.spring5"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {

}
