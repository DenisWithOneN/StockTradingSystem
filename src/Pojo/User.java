package Pojo;

import MarketManagement.StockMarket;
import Transactions.BuyTransaction;
import Transactions.BuyTransactionFactory;
import Transactions.Transaction;
import Transactions.TransactionFactory;

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

    public Pojo.Portfolio getPortfolio() {
        return Portfolio;
    }
    public void setStockMarket(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
    }
    public StockMarket searchStockMarket() {
        return null;
    }
    public void buyStock(Stock stock, int quantity){
        if(stock.getStockPrice() * quantity > budget) {
            System.out.println("You don't have enough money to buy this stock");
        } else {
            budget -= stock.getStockPrice() * quantity;
            stock.setStockQuantity(stock.getStockQuantity() - quantity);
            Portfolio.addPortfolioStock(stock);

            TransactionFactory buyTransactionFactory = new BuyTransactionFactory();
            Transaction buyTransaction = buyTransactionFactory.createTransaction(stock, quantity);
            transactionsHistory.add(buyTransaction);
        }
    }
    public void sellStock() {}

}
