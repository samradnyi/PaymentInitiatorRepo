package org.paymentinitiator.processor.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccountStatementResponse {
    BigDecimal earmarkAmount;
    String earmarkCurrency;
    String debitAccount;
    String businessDate;
    String accountBranch;
    String earmarkReference;
    String sourceSystem;
    String status;
}
