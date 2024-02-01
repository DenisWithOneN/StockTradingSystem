package TradingStrategies;

import Pojo.Stock;
import Pojo.User;
import Transactions.Transaction;

public class LongTermTrade implements TradingStrategy {

    @Override
    public void tradeStrategy(User user, Stock stock, int quantity) {
        user.buyStock(stock, quantity);
        user.sellStock(stock, quantity);

        for(Transaction transaction : user.getTransactionsHistory()) {
                for(Transaction transaction2 : user.getTransactionsHistory()) {
                    if(transaction.getTransactionType().equals("Buy") && transaction2.getTransactionType().equals("Sell") && transaction.getStock().getStockSymbol().equals(transaction2.getStock().getStockSymbol()) && transaction.getTransactionDate().equals(transaction2.getTransactionDate())) {
                        System.out.println("Day Trade");
                        break;
                    }
                    else {
                        System.out.println("Long term trade");
                        user.setBudget(user.getBudget() - user.getBudget()*(5/100)*stock.getStockPrice());
                    }
                }

        }

    }
}
