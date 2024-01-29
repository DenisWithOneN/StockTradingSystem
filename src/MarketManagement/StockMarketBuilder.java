package MarketManagement;

import Pojo.Stock;

import java.util.ArrayList;
import java.util.List;

public class StockMarketBuilder {
    private List<Stock> stocks = new ArrayList<>();

    public StockMarketBuilder addStock(Stock stock) {
        stocks.add(stock);
        return this;
    }

    public StockMarket build() {
        return new StockMarket(stocks);
    }
}
