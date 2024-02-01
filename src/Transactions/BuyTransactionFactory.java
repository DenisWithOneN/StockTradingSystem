package Transactions;

import Pojo.Stock;

public class BuyTransactionFactory extends TransactionFactory {
    @Override
    public Transaction createTransaction(Stock stock, int quantity) {
        return new BuyTransaction(stock, quantity);
    }
}
