package Transactions;

import Pojo.Stock;

import java.sql.Timestamp;
import java.time.LocalDate;

public class BuyTransaction implements Transaction{

    private String transactionType;
    private int quantity;
    private LocalDate transactionDate;
    private Stock stock;

    public BuyTransaction(Stock stock, int quantity) {
        this.stock = stock;
        this.quantity = quantity;
        this.transactionType = "Buy";
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
        return stock.getStockPrice();
    }

    @Override
    public LocalDate getTransactionDate() {
        return transactionDate;

    }
}
