package TradingSystem;

import Pojo.Portfolio;
import Pojo.Stock;
import Pojo.User;
import Transactions.Transaction;

import java.util.ArrayList;
import java.util.List;

public class SystemTradingSimulator {

    public void run() {
        User user = new User("John", "Doe", 200);
        for(Stock stock : user.getPortfolio().getPortfolioStocks()) {
            System.out.println(stock.getStockName());
        }

        Stock stock = new Stock("AAPL", 100);
        user.getPortfolio().addStock(stock);
        user.getPortfolio().removeStock(stock);

        System.out.println("SystemTradingSimulator.run");
    }
}
