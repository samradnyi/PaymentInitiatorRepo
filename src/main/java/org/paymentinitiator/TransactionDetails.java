package org.paymentinitiator;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransactionDetails {
    String requestId;
    String accountNo;
    String branchCode;
    String txnCurrency;
    String txnDate;
    String expiryDate;
    BigDecimal amount;
}
