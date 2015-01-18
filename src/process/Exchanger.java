package process;

import model.ExchangeRate;
import model.Money;

public class Exchanger {

    public Money exchange(Money money, ExchangeRate exchangeRate) {
        return new Money(money.getAmount()*exchangeRate.getRate(),exchangeRate.getToCurrency());
    }

}