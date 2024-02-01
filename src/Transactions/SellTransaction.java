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

    @Override
    public void displayTransactionDetails() {
//        System.out.println("Transaction Type: " + transactionType);
//        System.out.println("Stock Name: " + stock.getStockName());
//        System.out.println("Stock Symbol: " + stock.getStockSymbol());
//        System.out.println("Stock Price: " + stock.getStockPrice());
//        System.out.println("Stock Quantity: " + quantity);
//        System.out.println("Transaction Date: " + transactionDate);

        System.out.println("transaction type: "+ transactionType + " " + "name: " + stock.getStockName() + " " + "symbol: " +  stock.getStockSymbol() + " " + "price: " + stock.getStockPrice() + " " + "quantity: " + quantity + " " + "date: " + transactionDate);
    }
}
