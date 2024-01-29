import Pojo.Stock;

public class StocksManager {
    private StockMarket stockMarket;

    public StocksManager(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
    }
    public void displayStocks(StockMarket stockMarket) {
        for (Stock stock : stockMarket.getStocks()) {
            System.out.println(stock.getStockName() + " " + stock.getStockSymbol() + " " + stock.getStockPrice() + " " + stock.getStockQuantity());
        }
    }
    public void addStock(StockMarket stockMarket, Stock stock) {
        stockMarket.getStocks().add(stock);
    }
    public void updateStockPrice(StockMarket stockMarket, String stockSymbol, double newPrice) {
        for (Stock stock : stockMarket.getStocks()) {
            if (stock.getStockSymbol().equals(stockSymbol)) {
                stock.setStockPrice(newPrice);
            }
        }
    }






}
