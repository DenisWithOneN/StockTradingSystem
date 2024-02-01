package TradingStrategies;

import Pojo.Stock;

public interface TradingStrategy {

    void tradeStrategy(Stock stock, int quantity);
}
