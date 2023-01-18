package generics.exchangeDesk;

import java.lang.reflect.Constructor;
import java.util.LinkedList;

public class ExchangeDesk {

    private LinkedList<Rate> rates = new LinkedList<Rate>();

    public <S extends Currency, D extends Currency> D exchange(S source, Class<D> destination) throws ReflectiveOperationException{
        D destinationCurrency = null ;
        float sourceValue = source.getValue();

        Constructor<D>[] constructors = (Constructor<D>[]) destination.getDeclaredConstructors();
        destinationCurrency = constructors[0].newInstance(sourceValue/ findRate(source.getClass(), destination));

        return destinationCurrency;
    }

    public <S extends Currency, D extends Currency> void addRate(Class<S> source, Class<D> destination, float rate){
        rates.add(new Rate(source, destination, rate));
    }

    private float findRate(Class source, Class destination){
        for(Rate rate: rates){
            if(rate.getSource().equals(source) && rate.getDestination().equals(destination))
                return rate.getRate();
        }
        return 0;
    }
}
