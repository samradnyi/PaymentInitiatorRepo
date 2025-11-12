package org.paymentinitiator.mongo;

import lombok.Data;
import org.paymentinitiator.processor.entity.TransactionDetails;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("transaction_details")
@Data
public class TransactionDetailsEntity {
    private TransactionDetails transactionDetails;
}
