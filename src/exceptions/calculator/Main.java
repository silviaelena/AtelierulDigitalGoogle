package exceptions.calculator;

public class Main {
    public static void main(String[] args) throws NumberTooHighException {
        ComplexCalculator cc = new ComplexCalculator();
        cc.complexOperation(6);
    }
}
