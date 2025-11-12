package org.paymentinitiator.processor.entity;

import lombok.Data;

import java.util.List;

@Data
public class StatementRequest {
    String requestId;
    List<String> accountList;
}
