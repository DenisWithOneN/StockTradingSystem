package Transactions;

import java.sql.Timestamp;

public class SellTransaction implements Transaction{
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
    public Timestamp getTransactionTime() {
        return null;
    }
}
