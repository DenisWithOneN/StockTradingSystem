# Pojo.Stock Trading System Application <br>
Design Patterns Project #3
---

Singleton Pattern (SystemTradingSimulator)
- Ne asiguram ca exista o singura instanta a simulatorului de tranzactionare in intreaga aplicatie

Builder (StockMarketBuilder)
- Ne asiguram ca obiectele de tip StockMarket sunt create in mod coerent si consistent, pentru a construi si initializa piata de actiuni ('StockMarket') cu actiunile dorite.
- Putem adauga actiunile in builder folosind metoda addStock(), iar apoi sa construim piata de actiuni folosind metoda build()

Factory (TransactionFactory)
- Folosim pentru a crea tranzactii (BuyTransactionFactory, SellTransactionFactory)
- Se poate extinde pentru a crea si alte tipuri de tranzactii

Strategy (TradingStrategy)
- Folosim pentru a implementa diferite strategii de tranzactionare (DailyTrade, LongTermTrade)
- Se poate extinde pentru a implementa si alte strategii de tranzactionare

![image](https://github.com/DenisWithOneN/StockTradingSystem/assets/126503316/172fe4a2-5ff3-4997-bb8c-ec7e9404f268)
