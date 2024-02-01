package Transactions;

import Pojo.Stock;

public class SellTransactionFactory extends TransactionFactory {
    @Override
    public Transaction createTransaction(Stock stock, int quantity) {
        return new SellTransaction(stock, quantity);
    }
}