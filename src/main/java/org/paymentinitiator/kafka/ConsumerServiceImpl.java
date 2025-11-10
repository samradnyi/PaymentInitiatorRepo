package org.paymentinitiator.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl {

//    @KafkaListener(topics = "test", groupId = "my-spring-boot-group")
//    public void listen(ConsumerRecord<String, Object> message) {
//        System.out.println("Received Message: " + message);
//        // Process the received message here
//    }
}
