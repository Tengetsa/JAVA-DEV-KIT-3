package Task3;

/*
    Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. Класс должен иметь методы
    getFirst(), getSecond() для получения значений каждого из составляющих пары, а также переопределение метода
    toString(), возвращающее строковое представление пары.
 */

public class Pair<T, F> {
    T t;
    F f;

    public Pair(T t, F f) {
        this.t = t;
        this.f = f;
    }

    public T getFirst() {
        return t;
    }

    public F getSecond() {
        return f;
    }

    @Override
    public String toString() {
        return t + ":" + f;
    }
}
