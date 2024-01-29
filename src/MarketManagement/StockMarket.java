package MarketManagement;

import Pojo.Stock;

import java.util.List;

public class StockMarket {
    private List<Stock> stocks;
    public StockMarket(List<Stock> stocks) {
        this.stocks = stocks;
    }
    public List<Stock> getStocks() {
        return stocks;
    }


}
