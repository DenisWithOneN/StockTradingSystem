package Transactions;

import Pojo.Stock;

import java.sql.Timestamp;
import java.time.LocalDate;

public interface Transaction {
    String getTransactionType();
    int getQuantity();
    Stock getStock();
    double getTransactionPrice();
    LocalDate getTransactionDate();
    void displayTransactionDetails();

}
