package Transactions;

import java.sql.Timestamp;

public class BuyTransaction implements Transaction{
    @Override
    public String getTransactionType() {
        return null;
    }

    @Override
    public int getQuantity() {
        return 0;
    }

    @Override
    public double getTransactionPrice() {
        return 0;
    }

    @Override
    public Timestamp getTransactionDate() {
        return null;
    }
}
