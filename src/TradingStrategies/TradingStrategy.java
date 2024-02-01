package TradingStrategies;

import Pojo.Stock;
import Pojo.User;

public interface TradingStrategy {
    void tradeStrategy(User user, Stock stock, int quantity);
}
