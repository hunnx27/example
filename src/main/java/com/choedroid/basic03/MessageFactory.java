package com.choedroid.basic03;

public class MessageFactory {
	private static MessageFactory factory = new MessageFactory();
	private MessageFactory(){} //싱글톤
	
	public static MessageFactory getInstance(){
		return factory;
	}
	
	public MessageBean createMessage(String nation){
		if(nation.equals("kr")){
			return new MessageBeanKr();
		}
		else if(nation.equals("en"))
			return new MessageBeanEn();
		else
			return null;
	}
}
