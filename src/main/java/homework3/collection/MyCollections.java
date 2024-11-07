package homework3.collection;

import java.util.Comparator;

public class MyCollections {

    private MyCollections() {
    }

    public static <T> void sort(MyList<T> list, Comparator<T> comparator) {
        list.sort(comparator);
    }
}
