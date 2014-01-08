package com.choedroid.basic03;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        MessageBean bean =
        		MessageFactory.getInstance().createMessage("kr");
        bean.sayHello("홍길동");
        
        bean =
        		MessageFactory.getInstance().createMessage("en");
        bean.sayHello("이순신");
        
    }
}
