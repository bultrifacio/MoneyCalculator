package persistence;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {

    private CurrencySet currencySet = new CurrencySet();

    public CurrencySet load() {
        currencySet.add(new Currency("EUR", "€", "EURO"));
        currencySet.add(new Currency("USD", "$", "DOLLAR"));
        return currencySet;
    }
}
