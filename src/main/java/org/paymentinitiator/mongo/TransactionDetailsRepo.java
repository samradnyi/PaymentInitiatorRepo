package org.paymentinitiator.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDetailsRepo extends MongoRepository<TransactionDetailsEntity, Object> {
}
