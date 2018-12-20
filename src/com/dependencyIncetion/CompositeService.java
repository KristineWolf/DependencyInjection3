package com.dependencyIncetion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CompositeService {
	@Autowired
	private MessageInterface messageInterface1;
	@Autowired
	private MessageInterface messageInterface2;
	
	@Autowired
	public CompositeService(MessageInterface messageInterface1, MessageInterface messageInterface2) {
		this.messageInterface1=messageInterface1;
		this.messageInterface2=messageInterface2;
	}
	
	public void sendMessage() {
		System.out.println("Call Composite Service");
		this.messageInterface1.sendMessage();
		this.messageInterface2.sendMessage();
	}

}
