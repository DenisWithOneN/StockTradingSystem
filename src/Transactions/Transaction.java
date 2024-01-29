package Transactions;

import java.sql.Timestamp;

public interface Transaction {

//    Stock getStock();
    String getTransactionType();
    int getQuantity();
    double getTransactionPrice();
    Timestamp getTransactionTime();

}
