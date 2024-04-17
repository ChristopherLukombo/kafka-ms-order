package com.course.kafka.broker.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.course.kafka.broker.message.OrderReplyMessage;

@Service
public class OrderReplyConsumer {

	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@KafkaListener(topics = "t-commodity-order-reply")
	public void listen(OrderReplyMessage message) {
		log.info("Reply message received : {}", message);
	}
}
