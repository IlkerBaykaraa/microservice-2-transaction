package microservice.productorder2transaction.service;

import microservice.productorder2transaction.model.Transaction;
import microservice.productorder2transaction.repository.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import java.time.LocalDateTime;

@Service
public class TransactionService implements ITransactionService{

    @Autowired
    private ITransactionRepository transactionRepository;

    @Override
    public Transaction saveTransaction(Transaction transaction)
    {
        transaction.setTransactionTime(LocalDateTime.now());
        return transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(Long transactionId)
    {
        transactionRepository.deleteById(transactionId);
    }

}
