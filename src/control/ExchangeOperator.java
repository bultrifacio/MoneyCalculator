package control;

import model.ExchangeRate;
import model.Money;
import view.ExchangeDialog;
import view.ExchangeRateLoader;
import view.Exchanger;
import view.MoneyDisplay;

public class ExchangeOperator {
    Money money = new Money(100, null);
    ExchangeRate exchangeRate = new ExchangeRate(null, null, null, 1);
    ExchangeDialog exchangeDialog = new ExchangeDialog();
    ExchangeRateLoader exchangeRateLoader = new ExchangeRateLoader().load();
    MoneyDisplay moneyDisplay = new MoneyDisplay();
    Exchanger exchanger = new Exchanger().exchange(money, exchangeRate);
    public ExchangeOperator execute() {
        return null;
    }
    
}
