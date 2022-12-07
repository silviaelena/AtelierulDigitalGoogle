package exceptions.calculator;

public class ComplexCalculator {
    public float complexOperation(int nr) throws NumberTooHighException {
        float result = 3.5f;
        if (nr > 4) {
            throw new NumberTooHighException();
        }
        return result;
    };
}
