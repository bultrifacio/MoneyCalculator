package application;

import control.ExchangeOperator;
import view.CurrencySetLoader;

public class APP {
    ExchangeOperator exchangeOperator = new ExchangeOperator().execute();
    CurrencySetLoader currencySetLoader = new CurrencySetLoader();
}
