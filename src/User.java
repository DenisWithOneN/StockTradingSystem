import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String password;
    private double budget;
    private List<Transaction> transactionsHistory;
    private List<Stock> Portfolio;

    public User(String username, String password, double budget, List<Transaction> transactionsHistory, List<Stock> Portfolio) {
        this.username = username;
        this.password = password;
        this.budget = budget;
        this.transactionsHistory = new ArrayList<>();
        this.Portfolio = new ArrayList<>();
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

    public void setTransactionsHistory(List<Transaction> transactionsHistory) {
        this.transactionsHistory = transactionsHistory;
    }

    public List<Stock> getPortfolio() {
        return Portfolio;
    }

    public void setPortfolio(List<Stock> portfolio) {
        Portfolio = portfolio;
    }
}
