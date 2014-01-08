package com.choedroid.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBeanImpl implements MessageBean, BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
	private String name;
	private int age;
	private String greeting;
	
	
	public MessageBeanImpl(String name){//생성자로 세터
		this.name = name;
	}
	
	public MessageBeanImpl(String name, int age){ //생성자 오버로딩
		this.name = name;
		this.age = age;
		System.out.println("1. 빈의 생성자 실행");
	}
	
	public void setGreeting(String greeting){
		this.greeting = greeting;
		System.out.println("2. setter메서드 실행");
	}
	
	
	
	
	public void sayHello() {
		String msg = greeting + "~~" + name + "!....저는" + age + "살입니다.";
		
		System.out.println(msg);
	}

	public void destroy() throws Exception {
		System.out.println("종료");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("6. 프로퍼티 지정 완료");
	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("4. Bean factory 지정 : " + arg0.getClass());
	}

	public void setBeanName(String arg0) {
		System.out.println("3. bean 이름 지정: " + arg0);
	}
	
	public void init(){//초기화 (임의로 만든 메서드)
		System.out.println("7. 초기화 메서드실행 ");
	}

}
