package com.choedroid.noxml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App {
    public static void main( String[] args ){
    	ApplicationContext ctx = 
    			new AnnotationConfigApplicationContext(ApplicationContextConfiguration.class);
    	MessageBean bean = ctx.getBean("messageBeanKr",MessageBean.class);
    	bean.sayHello("홍길동");
    	bean = ctx.getBean("messageBeanEn", MessageBean.class);
    	bean.sayHello("Tom");
    }
}



