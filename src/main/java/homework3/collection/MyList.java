package homework3.collection;

import java.util.Comparator;

public interface MyList<T> extends MyCollection<T> {
    T get(int index);

    boolean add(T element);

    boolean add(T element, int index);

    boolean remove(T element);

    boolean removeAt(int index);

    boolean contains(T element);

    int size();

    void sort(Comparator<T> comparator);

    void clear();
}
