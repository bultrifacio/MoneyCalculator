package model;

/*public class Exchanger {

    public static Money exchange(Money money, ExchangeRate exchangeRate) {
        return new Money(money.getAmount(), exchangeRate.getTo());
    }
}*/

import model.ExchangeRate;
import model.Money;

public class Exchanger {

    public Money exchange(Money money, ExchangeRate exchangeRate) {
        return new Money(money.getAmount()*exchangeRate.getRate(),exchangeRate.getToCurrency());
    }

}