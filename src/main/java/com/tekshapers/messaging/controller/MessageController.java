package com.tekshapers.messaging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tekshapers.messaging.entity.Message;
import com.tekshapers.messaging.service.MessageService;

@RestController
public class MessageController 
{
	@Autowired
	private MessageService messageService;
	
	@PostMapping("/message")
	public void displayMessage(@RequestBody Message message)
	{
		messageService.addMessage(message);
	}
}
