package com.course.kafka.broker.producer;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.header.internals.RecordHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.course.kafka.broker.message.OrderMessage;

@Service
public class OrderProducer {
	
	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private KafkaTemplate<String, OrderMessage> kafkaTemplate;

	public void publish(OrderMessage message) {
		
		var producerRecord = buildProducerRecord(message);
		
		kafkaTemplate.send(producerRecord)
		.whenComplete((result, ex) -> {
			if (ex == null) {
				log.info("Order {}, item {} published succesfully", message.getOrderNumber(), message.getItemName());
			} else {
				log.warn("Order {}, item {} failed to publish because {}", message.getOrderNumber(), message.getItemName(), ex.getMessage());
			}
		});
		
		log.info("Just a dummy message for order {}, item {}", message.getOrderNumber(), message.getItemName());
	}
	
	private ProducerRecord<String, OrderMessage> buildProducerRecord(OrderMessage message) {
		var surpriseBonus = StringUtils.startsWithIgnoreCase(message.getOrderLocation(), "A") ? 25 : 15;
		var headers = new ArrayList<Header>();
		
	    var surpriseBonusHeader = new RecordHeader("surpriseBonus", Integer.toString(surpriseBonus).getBytes());
	    
	    headers.add(surpriseBonusHeader);
	    
	    return new ProducerRecord<>("t-commodity-order", null, message.getOrderNumber(), message, headers);
	}
}
