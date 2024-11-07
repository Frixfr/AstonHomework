package homework3.collection;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        for (int i = 0; i < 50; i++) {
            myArrayList.add((int) (Math.random() * 1000));
        }
        System.out.println(myArrayList);

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>(myArrayList);
        for (int element : myLinkedList) {
            System.out.print(element + ", ");
        }
        myArrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("\n" + myArrayList);

        myLinkedList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int element : myLinkedList) {
            System.out.print(element + ", ");
        }

        myArrayList.add(34, 5);

        MyCollections.sort(myArrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println("\n" + myArrayList);
    }
}
