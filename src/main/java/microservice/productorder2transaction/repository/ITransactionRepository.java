package microservice.productorder2transaction.repository;

import microservice.productorder2transaction.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITransactionRepository extends JpaRepository<Transaction,Long> {


    
}
