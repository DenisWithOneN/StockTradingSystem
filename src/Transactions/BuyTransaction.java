package Transactions;

import java.sql.Timestamp;
import java.time.LocalDate;

public class BuyTransaction implements Transaction{

    private String transactionType;
    private int quantity;
    private double transactionPrice;
    private LocalDate transactionDate;

    public BuyTransaction(int quantity, double transactionPrice) {
        this.transactionType = "Buy";
        this.quantity = quantity;
        this.transactionPrice = transactionPrice;
        this.transactionDate = LocalDate.now();
    }
    @Override
    public String getTransactionType() {
        return transactionType;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public double getTransactionPrice() {
        return transactionPrice;
    }

    @Override
    public LocalDate getTransactionDate() {
        return transactionDate;

    }
}
