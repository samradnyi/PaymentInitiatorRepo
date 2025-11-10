package org.paymentinitiator.kafka;

import org.paymentinitiator.TransactionDetails;

public interface PublisherService {

    public void publishMessage(TransactionDetails transactionDetails);

}
