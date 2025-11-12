package org.paymentinitiator.kafka;

import org.paymentinitiator.processor.entity.TransactionDetails;

public interface PublisherService {

    public void publishMessage(TransactionDetails transactionDetails);

}
