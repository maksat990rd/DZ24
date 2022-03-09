package ClassWork;

import java.util.*;

/**
 * Случайным образом заполните Array, ArrayList и LinkedList числами 0 и 1.
 * Создайте методы перегрузки, чтобы они возвращали отсортированные элементы. 0 в начале и 1 в конце.
 */

public class Main {

    public static void main(String[] args) {

        Random ran = new Random();
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = ran.nextInt(2);
        }
        System.out.println("Сортировка массива: ");
        sortedArray(array);

        System.out.println("* * * * * * * * * * * * * * * * * * * *");

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(ran.nextInt(2));
        }
        System.out.println("Сортировка ArrayList: ");
        sortedArray(arrayList);

        System.out.println("* * * * * * * * * * * * * * * * * * * *");

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            linkedList.add(ran.nextInt(2));
        }
        System.out.println("Сортировка LinkedList: ");
        sortedArray(linkedList);
    }
    public static void sortedArray(ArrayList<Integer> arrayList) {

        Collections.sort(arrayList);


        System.out.println(arrayList);
    }

    public static void sortedArray(LinkedList<Integer> linkedList) {

        Collections.sort(linkedList);


        System.out.println(linkedList);
    }

    public static void sortedArray(int[] array) {

        Arrays.sort(array);
        for (int a : array) {
            System.out.print(a + " ");

        }
    }

}

