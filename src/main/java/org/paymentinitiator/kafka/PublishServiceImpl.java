package org.paymentinitiator.kafka;

import org.paymentinitiator.processor.entity.TransactionDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PublishServiceImpl implements PublisherService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;
    /**
     * @param transactionDetails
     */
    @Override
    public void publishMessage(TransactionDetails transactionDetails) {
        System.out.println("sending message on kafka");
        kafkaTemplate.send("test", transactionDetails);
        System.out.println("message sent successfully");
    }
}
