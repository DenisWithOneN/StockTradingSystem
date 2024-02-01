package Transactions;

public abstract class TransactionFactory {
    public abstract Transaction createTransaction(int quantity, double transactionPrice);
}
