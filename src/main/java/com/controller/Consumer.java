package com.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "my_topic", groupId = "group_1")
	public void listenToTopic(String msgReceived) {
		System.out.println("Message received " + msgReceived);
	}

}
