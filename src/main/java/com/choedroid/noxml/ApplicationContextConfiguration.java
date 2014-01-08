package com.choedroid.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationContextConfiguration {
	@Bean
	public MessageBeanKr messageBeanKr(){
		return new MessageBeanKr();
	}
	@Bean
	public MessageBeanEn messageBeanEn(){
		return new MessageBeanEn();
	}
}
