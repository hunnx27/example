package com.choedroid.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestA {
	private TestB b;
	private TestC c;
	
	//auto-wire속성의 값이 byType일 경우 setter가 있어야 한다.
	//annotation을 이용한 autowiring방법
	@Autowired(required=false) //required속성이 true이면 반드시 TestB가 필요하다!
	public void setB(TestB b1){
		this.b = b1;
	}
	@Autowired
	public void setC(TestC c1){
		this.c = c1;
	}
	
	
	public static void main(String[] args){
		ApplicationContext factory = new FileSystemXmlApplicationContext("autowire_config.xml");
		/*
		TestB bean =(TestB)factory.getBean("b");
		bean.display();
		
		TestC bean2 =(TestC)factory.getBean("c");
		bean.display();
		*/
		
		//autowiring을 이용하지않은 방법 ,autowiring을 이용한 방법
		TestA bean =(TestA)factory.getBean("a");
		
		//bean.b.display();//required가 false일경우 일단 생략하고 테스트!
		bean.c.display();
		
		
		
		
	}
}
