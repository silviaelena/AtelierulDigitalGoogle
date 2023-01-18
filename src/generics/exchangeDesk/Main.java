package generics.exchangeDesk;

public class Main {
    public static void main(String[] args) throws ReflectiveOperationException {
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        exchangeDesk.addRate(RON.class, USD.class, 4.6f);
        exchangeDesk.addRate(USD.class, RON.class, 0.22f);

        RON ron = new RON(10);
        USD ronToUsd = exchangeDesk.exchange(ron, USD.class);
        System.out.println(ronToUsd);

        USD usd = new USD(10);
        RON usdToRon = exchangeDesk.exchange(usd, RON.class);
        System.out.println(usdToRon);
    }
}
