package Pojo;

import MarketManagement.StockMarket;
import Transactions.BuyTransaction;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String password;
    private double budget;
    private List<Transaction> transactionsHistory;
    private Portfolio Portfolio;

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

    public StockMarket searchStockMarket() {
        return null;
    }
    public void buyStock() {
        Stock stock = new Stock("Apple", "AAPL", 100, 30);

        BuyTransaction buyTransaction = new BuyTransaction(stock, stock.getStockQuantity());

    }
    public void sellStock() {}

}
