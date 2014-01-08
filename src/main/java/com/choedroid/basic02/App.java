package com.choedroid.basic02;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        MessageBean bean = new MessageBeanKr();
        bean.sayHello("홍길동");
        
        bean = new MessageBeanEn();
        bean.sayHello("홍길동");
    }
}
