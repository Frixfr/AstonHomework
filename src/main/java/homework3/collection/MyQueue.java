package homework3.collection;

public interface MyQueue<T> extends MyCollection<T> {
    boolean add(T element);

    T peek();

    T poll();
}
