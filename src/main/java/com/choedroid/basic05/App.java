package com.choedroid.basic05;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
 
public class App {
    public static void main( String[] args ) {
       ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:/com/ahndroid/basic05/Basic05_config.xml");
       ctx.getBean("mkr", MessageBean.class);
       
    }
}