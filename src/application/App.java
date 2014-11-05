package application;

import control.ExchangeOperation;
import model.CurrencySet;
import persistence.CurrencySetLoader;

public class App {

    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader().load();
        ExchangeOperation exchangeOperator = new ExchangeOperation(currencySet);
        exchangeOperator.execute();
    }
}
