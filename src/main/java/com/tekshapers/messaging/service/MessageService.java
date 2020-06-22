package com.tekshapers.messaging.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.stereotype.Service;

import com.tekshapers.messaging.entity.Message;
import com.tekshapers.messaging.repository.MessageRepository;
import com.tekshapers.messaging.util.MessageTask;

@Service
public class MessageService 
{
	@Autowired
	private MessageRepository messageRepository;
	@Autowired
	private MessageTask messageTask;
	@Autowired
	private TaskScheduler messageTaskScheduler;
	
	public void addMessage(Message message)
	{
		messageRepository.save(message);
		messageTask.setMessage(message);
		messageTaskScheduler.schedule(messageTask, message.getDisplayDate());
	}
}
