package com.choedroid.basic06;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;


public class App {
    public static void main( String[] args ){
       BeanFactory factory = new DefaultListableBeanFactory();
       new XmlBeanDefinitionReader((BeanDefinitionRegistry)factory)
       .loadBeanDefinitions(new FileSystemResource("Basic06_config.xml"));
       
       factory.getBean("msg",MessageBean.class);
       
       MessageBean bean = factory.getBean("msg", MessageBean.class);
       bean.sayHello();
    }
}
