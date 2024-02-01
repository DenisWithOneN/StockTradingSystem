package TradingSystem;

import MarketManagement.StockMarket;
import MarketManagement.StockMarketBuilder;
import MarketManagement.StocksManager;
import Pojo.Stock;
import Pojo.User;
import TradingStrategies.DailyTrade;
import TradingStrategies.LongTermTrade;
import TradingStrategies.TradingStrategy;

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
        User user = new User("", "", 200000);

        System.out.println("Stock Market:");

        StockMarket stockMarket = new StockMarketBuilder()
                .addStock(new Stock("Apple", "AAPL", 180, 30))
                .addStock(new Stock("Vanguard S&P 500", "VUSA", 72, 50))
                .addStock(new Stock("Microsoft", "MSFT", 200, 20))
                .addStock(new Stock("Amazon", "AMZN", 3000, 10))
                .addStock(new Stock("Google", "GOOGL", 2000, 10))
                .build();

        int choice;
        do {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");


            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    System.out.println("Inregistreaza-te!");
                    System.out.println("Introduceti numele utilizatorului: ");
                    String username = scanner.nextLine();
                    System.out.println("Introduceti parola utilizatorului: ");
                    String password = scanner.nextLine();

                    user.setUsername(username);
                    user.setPassword(password);
                    user.setStockMarket(stockMarket);
                    break;
                case 2:
                    System.out.println("Introduceti numele utilizatorului: ");
                    String usernameLogin = scanner.nextLine();
                    System.out.println("Introduceti parola utilizatorului: ");
                    String passwordLogin = scanner.nextLine();
                    if (usernameLogin.equals(user.getUsername()) && passwordLogin.equals(user.getPassword())){
                        System.out.println("Bun venit, " + user.getUsername() + "!");
                        System.out.println("Bugetul tau este: " + user.getBudget());

                        int choice2;
                        do {
                            System.out.println("\nMenu:");
                            System.out.println("1. Search");
                            System.out.println("2. Buy");
                            System.out.println("3. Sell");
                            System.out.println("4. Trading");
                            System.out.println("5. Transaction History");
                            System.out.println("6. Portfolio");
                            System.out.println("7. Stocks Market");
                            System.out.println("0. Exit");
                            System.out.print("Choose an option: ");


                            choice2 = scanner.nextInt();
                            scanner.nextLine();

                            switch (choice2){
                                case 1:
                                    System.out.println("Introduceti numele sau simbolul actiunii cautate: ");
                                    String userInput = scanner.nextLine();
                                    user.searchStockMarket(userInput);
                                    break;
                                case 2:
                                    System.out.println("Introduceti numele sau simbolul actiunii pe care doriti sa o cumparati: ");
                                    String stockName = scanner.nextLine();
                                    System.out.println("Introduceti cantitatea pe care doriti sa o cumparati: ");
                                    int quantity = scanner.nextInt();
                                    scanner.nextLine();

                                    user.buyStock(user.searchStockMarket(stockName), quantity);
                                    break;
                                case 3:
                                    System.out.println("Introduceti numele sau simbolul actiunii pe care doriti sa o vindeti: ");
                                    String stockName2 = scanner.nextLine();
                                    System.out.println("Introduceti cantitatea pe care doriti sa o vindeti: ");
                                    int quantity2 = scanner.nextInt();
                                    scanner.nextLine();
                                    user.sellStock(user.getPortfolio().searchStockName(stockName2), quantity2);
                                    break;
                                case 4:
                                    System.out.println("Selectați strategia de tranzacționare:");
                                    System.out.println("1. Daily Trade");
                                    System.out.println("2. Long-Term Trade");
                                    int strategyChoice = scanner.nextInt();
                                    scanner.nextLine();

                                    TradingStrategy strategy = null;
                                    if (strategyChoice == 1) {
                                        strategy = new DailyTrade();
                                    } else if (strategyChoice == 2) {
                                        strategy = new LongTermTrade();
                                    } else {
                                        System.out.println("Opțiune invalidă.");
                                        break;
                                    }

                                    // Apelul metodei tradeStrategy cu strategia corespunzătoare
//                                    strategy.tradeStrategy(user, stock, quantity);
                                    System.out.println("Aici trebuie sa fie actiunea de trading");

                                    break;
                                case 5:
                                    System.out.println("\n Istoricul tranzactiilor: ");
                                    user.displayTransactionsHistory();
                                    break;
                                case 6:
                                    System.out.println("\n Portofoliul tau: ");
                                    user.getPortfolio().displayPortfolioStocks();
                                    break;
                                case 7:
                                    System.out.println("\n Stocks Market: ");
                                    StocksManager stocksManager = new StocksManager(stockMarket);
                                    stocksManager.displayStocks(stockMarket);
                                    break;
                                case 0:
                                    System.out.println("Exiting program. Goodbye!");
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please choose again.");
                            }


                        } while(choice2 != 0);






                    } else {
                        System.out.println("Username sau parola gresita!");
                    }
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

//        user.setStockMarket(stockMarket);

//        user.buyStock(stock, 10);

//        user.buyStock(stock2, 3);
//        System.out.println("--------------------------");
//        System.out.println("bugetul userului este " + user.getBudget());
//        System.out.println("cantitatea noua dupa cumparare:" + stock.getStockQuantity());

//        user.getPortfolio().displayPortfolioStocks();

//        user.sellStock(user.getPortfolio().searchStock(stock), 2);

//        System.out.println("--------------------------");
//        user.getPortfolio().displayPortfolioStocks();

//        System.out.println("cantitatea noua dupa cumparare:" + stock.getStockQuantity());

//        user.searchStockMarket("AAPL");
//        user.searchStockMarket("Apple2322");

//        user.getPortfolio().addPortfolioStock(stock);
//        user.getPortfolio().addPortfolioStock(stock2);
//        user.getPortfolio().displayPortfolioStocks();

//        user.getPortfolio().removePortfolioStock(stock);


//        System.out.println("SystemTradingSimulator.run");
    }

    private void menu() {
        System.out.println("SystemTradingSimulator.menu");
    }
}
