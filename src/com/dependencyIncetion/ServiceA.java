package com.dependencyIncetion;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ServiceA implements MessageInterface{

	@Override
	public void sendMessage() {
		System.out.println("Call Service A");
	}

}
