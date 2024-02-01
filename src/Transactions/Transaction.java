package Transactions;

import java.sql.Timestamp;

public interface Transaction {
    String getTransactionType();
    int getQuantity();
    double getTransactionPrice();
    Timestamp getTransactionDate();

}
