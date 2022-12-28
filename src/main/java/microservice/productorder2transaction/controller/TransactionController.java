package microservice.productorder2transaction.controller;

import microservice.productorder2transaction.model.Transaction;
import microservice.productorder2transaction.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/transaction")
public class TransactionController
{
    @Autowired
    private ITransactionService transactionService;

    @PostMapping
    public ResponseEntity<?> saveTransaction (@RequestBody Transaction transaction)
    {
        return new ResponseEntity<>(transactionService.saveTransaction(transaction), HttpStatus.CREATED);
    }

    @DeleteMapping("{transactionId}")
    public ResponseEntity<?> deleteTransaction (@PathVariable Long transactionId)
    {
        transactionService.deleteTransaction(transactionId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllTransaction(){
        return ResponseEntity.ok(transactionService.getAll());
    }
}
