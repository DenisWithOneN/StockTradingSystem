package TradingSystem;

import MarketManagement.StockMarket;
import MarketManagement.StockMarketBuilder;
import MarketManagement.StocksManager;
import Pojo.Stock;
import Pojo.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class SystemTradingSimulator {
    private static SystemTradingSimulator instance;

    // Constructor privat pentru a împiedica crearea de instanțe în afara clasei
    private SystemTradingSimulator() {
    }

    // Metoda statică pentru accesarea instanței singleton
    public static SystemTradingSimulator getInstance() {
        if (instance == null) {
            instance = new SystemTradingSimulator();
        }
        return instance;
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele utilizatorului: ");
        String username = scanner.nextLine();
        System.out.println("Introduceti parola utilizatorului: ");
        String password = scanner.nextLine();
        User user = new User(username, password, 2000);
        System.out.println("Bun venit, " + user.getUsername() + "!");
        System.out.println("Bugetul tau este: " + user.getBudget());

        System.out.println("Stock Market:");



        StockMarket stockMarket = new StockMarketBuilder()
                .addStock(new Stock("Apple", "AAPL", 180, 30))
                .addStock(new Stock("Vanguard S&P 500", "VUSA", 72, 50))
                .addStock(new Stock("Microsoft", "MSFT", 200, 20))
                .addStock(new Stock("Amazon", "AMZN", 3000, 10))
                .addStock(new Stock("Google", "GOOGL", 2000, 10))
                .build();

        List<Stock> marketStocks = new ArrayList<>(stockMarket.getStocks());


        int choice;
        do {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Search Stock");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. Trading");
            System.out.println("5. Transaction History");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");


            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:

                    break;
                case 2:


                    break;
                case 3:


                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (choice != 0);

//        stocksManager.addStock(stockMarket, stock);
//        stocksManager.addStock(stockMarket, stock2);

//        stocksManager.displayStocks(stockMarket);

        user.setStockMarket(stockMarket);

//        user.buyStock(stock, 10);

//        user.buyStock(stock2, 3);
        System.out.println("--------------------------");
        System.out.println("bugetul userului este " + user.getBudget());
//        System.out.println("cantitatea noua dupa cumparare:" + stock.getStockQuantity());

        user.getPortfolio().displayPortfolioStocks();

//        user.sellStock(user.getPortfolio().searchStock(stock), 2);

        System.out.println("--------------------------");
        user.getPortfolio().displayPortfolioStocks();

//        System.out.println("cantitatea noua dupa cumparare:" + stock.getStockQuantity());

        user.searchStockMarket("AAPL");
        user.searchStockMarket("Apple2322");

//        user.getPortfolio().addPortfolioStock(stock);
//        user.getPortfolio().addPortfolioStock(stock2);
//        user.getPortfolio().displayPortfolioStocks();

//        user.getPortfolio().removePortfolioStock(stock);


        System.out.println("SystemTradingSimulator.run");
    }

    private void menu() {
        System.out.println("SystemTradingSimulator.menu");
    }
}
