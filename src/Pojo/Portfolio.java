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

    public void displayPortfolioStocks() {
        for(Stock stock : portfolioStocks) {
            System.out.println(stock.getStockName());
        }
    }

    public Stock searchStock(Stock searchStock) {
        for(Stock stock : portfolioStocks) {
            if (stock.getStockName().equals(searchStock.getStockName()))
                return stock;
        } return null;
    }

    public void addPortfolioStock(Stock stock) {
        portfolioStocks.add(stock);
    }

    public void removePortfolioStock(Stock stock) {
        portfolioStocks.remove(stock);
    }
}
