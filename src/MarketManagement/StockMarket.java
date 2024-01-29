package MarketManagement;

import Pojo.Stock;
import Pojo.User;

import java.util.ArrayList;
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

