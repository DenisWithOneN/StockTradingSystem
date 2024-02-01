package Transactions;

import java.sql.Timestamp;
import java.time.LocalDate;

public interface Transaction {
    String getTransactionType();
    int getQuantity();
    double getTransactionPrice();
    LocalDate getTransactionDate();
    void displayTransactionDetails();

}
