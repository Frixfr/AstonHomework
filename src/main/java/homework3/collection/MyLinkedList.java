package homework3.collection;

import java.util.Comparator;
import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T>, MyQueue<T> {

    private Node first;
    private Node last;
    private int size = 0;
    private boolean isSorted = false;

    public MyLinkedList(MyList<? extends T> list) {
        if (list instanceof MyLinkedList) {
            MyLinkedList<T> linkedList = (MyLinkedList<T>) list;
            first = linkedList.first;
            last = linkedList.last;
            size = linkedList.size;
        } else {
            for (T element : list) {
                this.add(element);
            }
        }
    }

    public MyLinkedList() {
    }

    @Override
    public T get(int index) {
        return getNode(index).value;
    }

    @Override
    public boolean add(T element) {
        if (size == 0) {
            first = new Node(null, element, null);
            last = first;
        } else {
            Node secondLast = last;
            last = new Node(secondLast, element, null);
            secondLast.next = last;
        }
        size++;
        isSorted = false;
        return true;
    }

    @Override
    public T peek() {
        return size > 0 ? get(0) : null;
    }

    @Override
    public T poll() {
        T element = get(0);
        removeAt(0);
        return element;
    }

    @Override
    public boolean add(T element, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            return add(element);
        }
        Node nodeNext = getNode(index);
        Node nodePrevious = nodeNext.previous;
        Node newNode = new Node(nodePrevious, element, nodeNext);
        nodeNext.previous = newNode;
        if (nodePrevious != null) {
            nodePrevious.next = newNode;
        } else {
            first = newNode;
        }
        size++;
        isSorted = false;
        return true;
    }

    @Override
    public boolean remove(T element) {
        int index = findElement(element);
        if (index == -1) {
            return remove(element);
        }
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        Node node = getNode(index);
        Node nodeNext = node.next;
        Node nodePrevious = node.previous;
        if (nodeNext != null) {
            nodeNext.previous = nodePrevious;
        } else {
            last = nodePrevious;
        }
        if (nodePrevious != null) {
            nodePrevious.next = nodeNext;
        } else {
            first = nodeNext;
        }
        size--;
        return true;
    }

    @Override
    public boolean contains(T element) {
        return findElement(element) != -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void sort(Comparator<T> comparator) {
        if (isSorted) {
            return;
        }

        for (int i = 0; i < size - 1; i++) {
            Node current = first;
            for (int j = 0; j < size - i - 1; j++) {
                Node nextNode = current.next;
                if (comparator.compare(current.value, nextNode.value) > 0) {
                    T swap = current.value;
                    current.value = nextNode.value;
                    nextNode.value = swap;
                }
                current = current.next;
            }
        }
        isSorted = true;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private Node node = first;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public T next() {
                T element = node.value;
                node = node.next;
                return element;
            }
        };
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "first=" + first +
                ", last=" + last +
                ", size=" + size +
                '}';
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node x = first; x != null; x = x.next)
            result[i++] = x.value;
        return result;
    }

    private int findElement(T element) {
        Node node = first;
        for (int i = 0; i < size; i++) {
            if (node.value.equals(element)) {
                return i;
            }
            node = node.next;
        }
        return -1;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private class Node {
        private Node previous;
        private T value;
        private Node next;

        public Node(Node previous, T value, Node next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
    }
}
