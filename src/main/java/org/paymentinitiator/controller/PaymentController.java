package org.paymentinitiator.controller;

import org.paymentinitiator.processor.StatementServiceImpl;
import org.paymentinitiator.processor.entity.StatementRequest;
import org.paymentinitiator.processor.entity.TransactionDetails;
import org.paymentinitiator.processor.PaymentInitiatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PaymentController {

    @Autowired
    PaymentInitiatorServiceImpl paymentInitiatorService;

    @Autowired
    StatementServiceImpl statementService;

    @PostMapping("/initiatepayment")
    public ResponseEntity<String> initiatePayment(@RequestBody TransactionDetails transactionDetails) {
        System.out.println("Payment request is received");
        paymentInitiatorService.initiatePayment(transactionDetails);
        return ResponseEntity.ok("SUCCESSFULL");
    }

    @GetMapping("/getAccStatement")
    public ResponseEntity<String> getAccountStatement(@RequestBody StatementRequest statementRequest) {
        statementService.getAccountStatement(statementRequest);
        return ResponseEntity.ok("SUCCESSFUL");
    }
}
