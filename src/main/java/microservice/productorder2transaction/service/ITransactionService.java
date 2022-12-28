package microservice.productorder2transaction.service;

import microservice.productorder2transaction.model.Transaction;

import java.util.List;

public interface ITransactionService {
    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

     List<Transaction> getAll();


}
