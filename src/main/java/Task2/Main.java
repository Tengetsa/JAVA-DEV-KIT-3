package Task2;

public class Main {
    /*
        Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
        и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать
        элементы одного типа.
     */

    public static void main(String[] args) {
        Number[] arr1 = {0, 3, 5, 2};
        Integer[] arr2 = {0, 3, 5, 2};
        Integer[] arr3 = {3, 4, 1, 5};
        Integer[] arr4 = {3, 4, 1, 5};
        Float[] arr5 = {1.f, 3.f, 6.3f, 34.f};
        Float[] arr6 = {1.f, 3.f, 6.3f, 34.f};
        Double[] arr7 = {3.3, 4.3, 5.3, 1.3};
        Double[] arr8 = {3.3, 4.3, 5.3, 1.3};
        String[] arr9 = {"3", "4", "5", "21"};
        String[] arr0 = {"3", "4", "5", "21"};

        System.out.println(compareArrays(arr2, arr1));

    }

    public static <T> boolean compareArrays(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
//            if (!arr1[i].getClass().getName().equals(arr2[i])) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        
        return true;
    }
}

