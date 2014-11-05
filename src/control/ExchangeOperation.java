package control;

import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;
import model.Money;
import ui.ExchangeDialog;
import persistence.ExchangeRateLoader;
import process.Exchanger;
import ui.MoneyDisplay;

public class ExchangeOperation {
    private Money money = new Money(100, null);
    private ExchangeRate exchangeRate = new ExchangeRate(null, null, null, 1);
    private ExchangeRateLoader exchangeRateLoader = new ExchangeRateLoader().load();
    private MoneyDisplay moneyDisplay = new MoneyDisplay();
    private final CurrencySet currencySet;
    
    public ExchangeOperation(CurrencySet currencySet) {
        this.currencySet= currencySet;
    }

    public void execute() {
        ExchangeDialog exchangeDialog = new ExchangeDialog(currencySet);
        exchangeDialog.execute();
        Exchange exchange = exchangeDialog.getExchange();
        Money exchanger = new Exchanger().exchange(money, exchangeRate);
    }
    private ExchangeRate readExchange(){
        return null;
        
    }
    private Exchange readExchangeRate(){
        return null;
        
    }
    private void exchangeMoney(){
        
    }
    private void displayMoney(){
        
    }
}
