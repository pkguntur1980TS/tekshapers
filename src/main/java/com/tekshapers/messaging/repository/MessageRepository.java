package com.tekshapers.messaging.repository;

import org.springframework.stereotype.Repository;

import com.tekshapers.messaging.entity.Message;

import org.springframework.data.repository.CrudRepository;


@Repository
public interface MessageRepository extends CrudRepository<Message, Long>
{
	
}
