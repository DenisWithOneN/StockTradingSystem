package Transactions;

public class SellTransactionFactory extends TransactionFactory {
    @Override
    public Transaction createTransaction(int quantity, double transactionPrice) {
        return new SellTransaction(Stock stock, int quantity);
    }
}