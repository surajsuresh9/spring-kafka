package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("rest/api")
@RestController
public class RestControllerForKafka {

	@Autowired
	Producer producer;

	@GetMapping("/producerMsg")
	public void getMessageFromProducer(@RequestParam("message") String message) {
		producer.sendMsgToTopic(message);
	}
}
