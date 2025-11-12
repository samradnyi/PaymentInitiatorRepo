package org.paymentinitiator.processor;

import org.paymentinitiator.processor.entity.StatementRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import javax.swing.plaf.nimbus.State;

public class StatementServiceImpl {

    @Autowired
    RestTemplate restTemplate;

    public void getAccountStatement(StatementRequest statementRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<StatementRequest> httpRequest = new HttpEntity<>(statementRequest, headers);
        restTemplate.exchange("url", HttpMethod.GET, httpRequest, State.class);
    }
}
