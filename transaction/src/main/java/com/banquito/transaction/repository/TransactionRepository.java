package com.banquito.transaction.repository;

import com.banquito.transaction.model.Transaction;

import java.security.Timestamp;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String> {
    Transaction findByCodeTransaction(String codeUniqueTransaction);
    List<Transaction> findByDates(Timestamp startDate, Timestamp endDate);
    
}