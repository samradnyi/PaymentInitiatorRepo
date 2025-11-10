package org.paymentinitiator.controller;

import org.paymentinitiator.TransactionDetails;
import org.paymentinitiator.kafka.PublisherService;
import org.paymentinitiator.processor.PaymentInitiatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PaymentController {

    @Autowired
    PaymentInitiatorServiceImpl paymentInitiatorService;

    @PostMapping("/initiatepayment")
    public ResponseEntity<String> initiatePayment(@RequestBody TransactionDetails transactionDetails) {
        System.out.println("Payment request is received");
        paymentInitiatorService.initiatePayment(transactionDetails);
        return ResponseEntity.ok("SUCCESSFULL");
    }
}
