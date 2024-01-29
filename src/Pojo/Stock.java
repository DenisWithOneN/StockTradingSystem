package Pojo;

public class Stock {

    private String stockName;
    private String stockSymbol;
    private double stockPrice;
    private int stockQuantity;

    public Stock(String stockName, String stockSymbol, double stockPrice, int stockQuantity) {
        this.stockName = stockName;
        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;
        this.stockQuantity = stockQuantity;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
