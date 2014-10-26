package model;

import java.util.Date;

public class Exchange {

    private final Date date;
    private final float money;
    private final Currency currency;

    public Exchange(Date date, float money, Currency currency) {
        this.date = date;
        this.money = money;
        this.currency = currency;
    }

    public Date getDate() {
        return date;
    }

    public float getMoney() {
        return money;
    }

    public Currency getCurrency() {
        return currency;
    }

}
