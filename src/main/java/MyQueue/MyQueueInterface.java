package MyQueue;

public interface MyQueueInterface<T> {
    boolean add();
    T element();
    void offer(T element);
    T peek();
    T pool();
    void remove();
}
