package com.choedroid.lifecycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class App {
    public static void main( String[] args ){
    	/*
       DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
       new XmlBeanDefinitionReader((BeanDefinitionRegistry)factory)
       .loadBeanDefinitions(new FileSystemResource("lifecycle_config.xml"));
       
       factory.addBeanPostProcessor(new CustomBeanPostProcessor());
       
       MessageBean bean = factory.getBean("msg", MessageBean.class);
       bean.sayHello();
       */
    	ApplicationContext factory = new FileSystemXmlApplicationContext("lifecycle_config.xml");
    	MessageBean bean = (MessageBean)factory.getBean("msg"); 
    	bean.sayHello();
    }
}
