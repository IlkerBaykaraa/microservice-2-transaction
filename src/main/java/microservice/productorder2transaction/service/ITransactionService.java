package microservice.productorder2transaction.service;

import microservice.productorder2transaction.model.Transaction;

public interface ITransactionService {
    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);


}
