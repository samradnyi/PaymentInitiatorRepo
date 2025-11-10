package org.paymentinitiator.mongo;

import lombok.Data;
import org.paymentinitiator.TransactionDetails;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document("transaction_details")
@Data
public class TransactionDetailsEntity {
    private TransactionDetails transactionDetails;
}
