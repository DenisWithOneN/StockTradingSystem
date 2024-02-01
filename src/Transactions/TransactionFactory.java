package Transactions;

import Pojo.Stock;

public abstract class TransactionFactory {
    public abstract Transaction createTransaction(Stock stock, int quantity);
}
