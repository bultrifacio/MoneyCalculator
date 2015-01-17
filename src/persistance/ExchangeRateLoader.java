package persistance;

import java.util.Date;
import model.Currency;
import model.ExchangeRate;

public interface ExchangeRateLoader {

    public ExchangeRate load(Date date, Currency from, Currency to);

    public ExchangeRate load(Currency from, Currency to);
}
