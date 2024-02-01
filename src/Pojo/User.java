package Pojo;

import MarketManagement.StockMarket;
import Transactions.*;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String password;
    private double budget;
    private List<Transaction> transactionsHistory;
    private Portfolio Portfolio;
    private StockMarket stockMarket;

    public User(String username, String password, double budget) {
        this.username = username;
        this.password = password;
        this.budget = budget;
        this.transactionsHistory = new ArrayList<>();
        this.Portfolio = new Portfolio();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<Transaction> getTransactionsHistory() {
        return transactionsHistory;
    }

    public void displayTransactionsHistory() {
        for(Transaction transaction : transactionsHistory) {
            transaction.displayTransactionDetails();
        }
    }

    public Transaction getSpecificTransaction(String stockName, String transactionType) {
        for (Transaction transaction : transactionsHistory) {
            if (transaction.getTransactionType().equals(transactionType) && transaction.getStock().getStockName().equals(stockName)) {
                return transaction;
            }
        }
        return null;
    }

    public Pojo.Portfolio getPortfolio() {
        return Portfolio;
    }

    public void setStockMarket(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
    }

    public Stock searchStockMarket(String userInput) {
        for (Stock stock : stockMarket.getStocks()) {
            if (stock.getStockName().equals(userInput) || stock.getStockSymbol().equals(userInput)) {
                System.out.println(
                        "Name: " + stock.getStockName() + " " + "symbol: " +  stock.getStockSymbol() + " " + "price: " + stock.getStockPrice() + " " + "quantity: " + stock.getStockQuantity());
                return stock;

            }
        }
        return null;
    }



    public void buyStock(Stock stock, int quantity) {
        if (stockMarket.getStocks().contains(stock)) {
            if (stock.getStockPrice() * quantity > budget) {
                System.out.println("You don't have enough money to buy this stock");
            } else {
                budget -= stock.getStockPrice() * quantity;
                Stock newStock = new Stock(stock.getStockName(), stock.getStockSymbol(), stock.getStockPrice(), quantity);
                Portfolio.addPortfolioStock(newStock);

                Portfolio.displayPortfolioStocks();

                stock.setStockQuantity(stock.getStockQuantity() - quantity);

                TransactionFactory buyTransactionFactory = new BuyTransactionFactory();
                Transaction buyTransaction = buyTransactionFactory.createTransaction(stock, quantity);
                transactionsHistory.add(buyTransaction);
                buyTransaction.displayTransactionDetails();
            }
        } else {
            System.out.println("Stock not found");
        }
    }

    public void sellStock(Stock stock, int quantity) {
        if (Portfolio.getPortfolioStocks().contains(stock)) {
            if (Portfolio.searchStock(stock).getStockQuantity() > quantity) {
                Portfolio.searchStock(stock).setStockQuantity(Portfolio.searchStock(stock).getStockQuantity() - quantity);
                budget += stock.getStockPrice() * quantity;

                TransactionFactory sellTransactionFactory = new SellTransactionFactory();
                Transaction sellTransaction = sellTransactionFactory.createTransaction(stock, quantity);
                transactionsHistory.add(sellTransaction);
                sellTransaction.displayTransactionDetails();

            } else if (Portfolio.searchStock(stock).getStockQuantity() == quantity) {
                Portfolio.removePortfolioStock(stock);
                budget += stock.getStockPrice() * quantity;

                TransactionFactory sellTransactionFactory = new SellTransactionFactory();
                Transaction sellTransaction = sellTransactionFactory.createTransaction(stock, quantity);
                transactionsHistory.add(sellTransaction);
                sellTransaction.displayTransactionDetails();
            } else {
                System.out.println("Nu ai suficiente actiuni!");
            }
        } else {
            System.out.println("Actiunea nu se afla in portofoliul tau!");
        }
    }
}
