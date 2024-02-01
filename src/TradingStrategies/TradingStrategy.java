package TradingStrategies;

import Pojo.Stock;

public interface TradingStrategy {
    void buy(Stock stock, int quantity);
    void sell(Stock stock, int quantity);
}
