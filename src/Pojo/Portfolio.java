package Pojo;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<Stock> portfolioStocks;

    public Portfolio() {
        portfolioStocks = new ArrayList<>();
    }


    public List<Stock> getPortfolioStocks() {
        return portfolioStocks;
    }

    public List<Stock> displayPortfolioStocks() {
        for(Stock stock : portfolioStocks) {
            System.out.println(stock.getStockName());
        }
        return portfolioStocks;
    }

    public void addPortfolioStock(Stock stock) {
        portfolioStocks.add(stock);
    }

    public void removePortfolioStock(Stock stock) {
        portfolioStocks.remove(stock);
    }
}
