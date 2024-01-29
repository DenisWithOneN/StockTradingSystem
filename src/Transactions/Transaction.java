package Transactions;

import java.sql.Timestamp;

public interface Transaction {

//    Pojo.Stock getStock();
    String getTransactionType();
    int getQuantity();
    double getTransactionPrice();
    Timestamp getTransactionTime();

}
