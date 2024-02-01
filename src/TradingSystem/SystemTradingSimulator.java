package TradingSystem;

import MarketManagement.StockMarket;
import MarketManagement.StocksManager;
import Pojo.Stock;
import Pojo.User;

import java.util.ArrayList;
import java.util.List;

public final class SystemTradingSimulator {
    private static SystemTradingSimulator instance;

    // Constructor privat pentru a împiedica crearea de instanțe în afara clasei
    private SystemTradingSimulator() {
    }

    // Metoda statică pentru accesarea instanței singleton
    public static SystemTradingSimulator getInstance() {
        if (instance == null) {
            instance = new SystemTradingSimulator();
        }
        return instance;
    }

    public void run() {
        User user = new User("John", "Doe", 200);

        Stock stock = new Stock("Apple", "AAPL", 100, 30);
        Stock stock2 = new Stock("Apple2", "AAPL2", 200, 60);

        List<Stock> marketStocks = new ArrayList<>();

        marketStocks.add(stock);
        marketStocks.add(stock2);


        StockMarket stockMarket = new StockMarket(marketStocks);
        StocksManager stocksManager = new StocksManager(stockMarket);


//        stocksManager.addStock(stockMarket, stock);
//        stocksManager.addStock(stockMarket, stock2);

        stocksManager.displayStocks(stockMarket);

//        user.getPortfolio().addPortfolioStock(stock);
//        user.getPortfolio().addPortfolioStock(stock2);
//        user.getPortfolio().displayPortfolioStocks();

//        user.getPortfolio().removePortfolioStock(stock);


        System.out.println("SystemTradingSimulator.run");
    }

    private void menu() {
        System.out.println("SystemTradingSimulator.menu");
    }
}
