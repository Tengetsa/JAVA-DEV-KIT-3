package Task1;
/*
    Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(),
    divide(), subtract()
 */

public class Calculator {

    public static <T extends Number> T sum(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
    }

    static <T extends Number> T multiply(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
    }

    static <T extends Number> T divide(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
    }

    static <T extends Number> T subtract(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
    }


}
