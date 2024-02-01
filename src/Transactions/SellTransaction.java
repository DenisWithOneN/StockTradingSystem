package Transactions;

import Pojo.Stock;

import java.sql.Timestamp;
import java.time.LocalDate;

public class SellTransaction implements Transaction{

    private String transactionType;
    private int quantity;
    private LocalDate transactionDate;
    private Stock stock;

    public SellTransaction(Stock stock, int quantity) {
        this.stock = stock;
        this.quantity = quantity;
        this.transactionType = "Sell";
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

    public double getTransactionTotalPrice() {
        return stock.getStockPrice() * quantity;
    }
}
