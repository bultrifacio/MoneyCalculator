package application;

import console.ExchangeDisplay;
import control.ExchangeOperation;
import mock.CurrencySetLoader;
import model.CurrencySet;
import swing.ApplicationFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application {

    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader().load();
        final ApplicationFrame frame = new ApplicationFrame(currencySet.toArray());
        frame.register(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExchangeOperation(frame.getExchangeDialog(), new ExchangeDisplay()).execute();
            }
        });
    }
}

