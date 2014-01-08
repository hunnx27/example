package com.choedroid.basic04;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory factory =
    		new XmlBeanFactory(new FileSystemResource("Basic04_config.xml")); //팩토리를 만들어줌
        MessageBean bean = 
        		factory.getBean("msgBeanKr", MessageBean.class); //MessageBean 어떤클래스형식인지 타입지정
        bean.sayHello("유관순");
        
        bean = factory.getBean("msgBeanKr", MessageBean.class); 
        bean.sayHello("최영");
        
        
        bean = factory.getBean("msgkr", MessageBean.class);
        bean.sayHello("공민왕");
        bean = factory.getBean("mkr", MessageBean.class);
        bean.sayHello("아수라");
        
        BeanFactory fac = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry)(fac));
        //fac이라는 변수를 xml파일을 읽을수 있는 능력을 주겠다.
        
        reader.loadBeanDefinitions(new FileSystemResource("Basic04_config.xml")); //특정xml파일 패스 지정해줌
        
        bean = fac.getBean("mkr", MessageBean.class);
        bean.sayHello("신돈");
    }
}



