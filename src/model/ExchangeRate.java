package model;

import java.util.Date;

public class ExchangeRate {

    private final Currency fromCurrency;
    private final Currency toCurrency;
    private final Date date;
    private final float rate;

    public ExchangeRate(Currency fromCurrency, Currency toCurrency, Date date, float rate) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.date = date;
        this.rate = rate;
    }

    public Currency getFromCurrency() {
        return fromCurrency;
    }

    public Currency getToCurrency() {
        return toCurrency;
    }

    public Date getDate() {
        return date;
    }

    public float getRate() {
        return rate;
    }

}
