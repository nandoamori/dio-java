package test;

import domain.Country;
import domain.Currency;
import domain.CurrencyFactory;

public class CurrencyFactoryTes01 { //factory mantém baixo acoplamento, facilita manutenção
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
