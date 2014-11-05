package model;
import java.util.HashMap;
import java.util.Map;

public class CurrencySet{
    private Map<String, Currency> currencySet= new HashMap<>();

    public Map<String, Currency> getCurrencySet() {
        return currencySet;
    }
    public void add(Currency currency){
        currencySet.put(currency.getCode(),currency);
    }
}
