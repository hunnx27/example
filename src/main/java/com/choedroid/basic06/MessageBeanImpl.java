package com.choedroid.basic06;

public class MessageBeanImpl implements MessageBean {
	private String name;
	private int age;
	private String greeting;
	private Outputter outputter;
	
	
	public MessageBeanImpl(String name){//생성자로 세터
		this.name = name;
	}
	
	public MessageBeanImpl(String name, int age){ //생성자 오버로딩
		this.name = name;
		this.age = age;
		System.out.println(name + ", " + age);
	}
	
	public void setGreeting(String greeting){
		this.greeting = greeting;
	}
	
	public void setOutputter(Outputter outputter){
		this.outputter = outputter;
	}
	
	public void sayHello() {
		String msg = greeting + "~~" + name + "!....저는" + age + "살입니다.";
		
		System.out.println(msg);
		
		try{
			outputter.output(msg);
		}
		catch(Exception err){}
	}

}
