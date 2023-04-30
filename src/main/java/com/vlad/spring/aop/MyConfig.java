package com.vlad.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.vlad.spring.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
