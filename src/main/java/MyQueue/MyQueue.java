package MyQueue;

import java.util.Collection;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;


class MyQueue<T> implements MyQueueInterface {
    private static final int ELEMENTS_LIMIT = 1000;
    private static final int DEFAULT_INIT_SIZE = 10;

    public MyQueue() {
        this.data = new Object [DEFAULT_INIT_SIZE];
    }

    public MyQueue(int newDefault){
        this.data = new Object[DEFAULT_INIT_SIZE];
    }

    @Override
    public boolean add(Object o) {
        if (data.length >= ELEMENTS_LIMIT)
            throw new QueueFullException("MyQueueInterface reached it's maximum elements capacity which is " + limit);
        else
            return data.add((T) o);
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public void offer(Object element) {

    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public Object pool() {
        return null;
    }

    @Override
    public void remove() {
        throw new NoSuchElementException("MyQueueInterface is empty, you cannot remove any element.");
    }
}
