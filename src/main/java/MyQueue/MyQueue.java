package MyQueue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

class MyQueue<T> extends LinkedList implements Queue {
    private static final int limit = 1000;
    private LinkedList <T> data = new LinkedList<>();

    @Override
    public boolean add(Object o) {
        if (data.size() >= limit)
            throw new QueueFullException("Queue reached it's maximum elements capacity which is " + limit);
        else
            data.add((T)o);
        return true;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object remove() throws NoSuchElementException {
        throw new NoSuchElementException("Queue is empty, you cannot remove any element.");
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }
}
