package com.choedroid.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		
		System.out.println("8 초기화 후 Bean에 대한 처리 실행 : " + arg1); //arg1 : 빈의 이름
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		
		System.out.println("5. 초기화 전 Bean에 대한 처리 실행 : " + arg1);
		return arg0; //arg1은 bean이름
	}

}
