package Task1;

public class Main {
    /*
    Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(),
    divide(), subtract(). Параметры этих методов – два числа разного типа (но необязательно разного между собой),
     над которыми должна быть произведена операция.
     */
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(3,5));
    }
}
