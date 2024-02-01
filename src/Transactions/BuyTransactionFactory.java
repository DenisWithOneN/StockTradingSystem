package Transactions;

public class BuyTransactionFactory extends TransactionFactory {
    @Override
    public Transaction createTransaction(int quantity, double transactionPrice) {
        return new BuyTransaction(quantity, transactionPrice);
    }
}
