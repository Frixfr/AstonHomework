package homework3.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public class MyArrayList<T> implements MyList<T> {

    private Object[] array = new Object[10];
    private int size = 0;
    private boolean isSorted = false;

    public MyArrayList(MyList<? extends T> list) {
        if (list instanceof MyArrayList) {
            MyArrayList<T> arrList = (MyArrayList<T>) list;
            array = arrList.array;
            size = arrList.size;
        } else {
            array = new Object[list.size()];
            for (T element : list) {
                this.add(element);
            }
        }
    }

    public MyArrayList() {
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) array[index];
    }

    @Override
    public boolean add(T element) {
        increaseArray();
        array[size++] = element;
        isSorted = false;
        return true;
    }

    @Override
    public boolean add(T element, int index) {
        increaseArray();
        checkIndex(index);
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        size++;
        isSorted = false;
        return true;
    }

    @Override
    public boolean remove(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return removeAt(i);
            }
        }
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        checkIndex(index);
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
        return true;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Object[10];
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return (T) array[index++];
            }
        };
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(array, size);
    }

    @Override
    public void sort(Comparator<T> comparator) {
        if (isSorted) {
            return;
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (comparator.compare((T) array[j], (T) array[j + 1]) > 0) {
                    T swap = (T) array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        isSorted = true;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void increaseArray() {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }
}
