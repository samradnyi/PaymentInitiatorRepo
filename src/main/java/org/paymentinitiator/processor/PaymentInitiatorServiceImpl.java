package org.paymentinitiator.processor;

import org.paymentinitiator.TransactionDetails;
import org.paymentinitiator.kafka.PublisherService;
import org.paymentinitiator.mongo.TransactionDetailsEntity;
import org.paymentinitiator.mongo.TransactionDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentInitiatorServiceImpl {

    @Autowired
    PublisherService publisherService;
    @Autowired
    private TransactionDetailsRepo transactionDetailsRepo;

    public void initiatePayment(TransactionDetails transactionDetails) {
        TransactionDetailsEntity transactionDetailsEntity = new TransactionDetailsEntity();
        transactionDetailsEntity.setTransactionDetails(transactionDetails);
        transactionDetailsRepo.save(transactionDetailsEntity);
//        publisherService.publishMessage(transactionDetails);
    }
}
