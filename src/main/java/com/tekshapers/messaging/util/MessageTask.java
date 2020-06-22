package com.tekshapers.messaging.util;

import com.tekshapers.messaging.entity.Message;

public class MessageTask implements Runnable
{
	private Message message;
	
	

	public Message getMessage() {
		return message;
	}



	public void setMessage(Message message) {
		this.message = message;
	}



	@Override
	public void run() 
	{
		System.out.println(message.getMessage());
	}
}
