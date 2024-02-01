package TradingStrategies;

import Pojo.Stock;
import Pojo.User;

public class DailyTrade implements TradingStrategy {


    @Override
    public void tradeStrategy(User user, Stock stock, int quantity) {
        user.buyStock(stock, quantity);
        user.sellStock(stock, quantity);

    }

}
