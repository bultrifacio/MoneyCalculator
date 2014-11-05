package ui;

import model.Currency;
import model.CurrencySet;
import model.Exchange;
import model.Money;

public class ExchangeDialog{
    private final CurrencySet currencySet;
    private Exchange exchange;
    private Money money = new Money(100, new Currency("EUR", "€", "EURO"));

    public ExchangeDialog(CurrencySet currencySet) {
        this.currencySet = currencySet;
        //currencySet.getCurrencySet().put("algo",getExchange());
    }
    public Exchange getExchange() {
        return exchange;
    }
    public void execute(){
        exchange = new Exchange(null,money,new Currency("USD","$","DOLLAR"));
    }
}