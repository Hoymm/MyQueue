package MyQueue;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class MyQueueTest {
    private MyQueueInterface<Integer> emptyQueue;

    @Before
    public void SetUp(){
        emptyQueue = new MyQueue();
    }

    @Test (expected = NoSuchElementException.class)
    public void emptyQueue_tryRemoveElement_ShouldResultInNoSuchElementException(){
        emptyQueue.remove();
    }

    @Test (expected = QueueFullException.class)
    public void add1001ElementsToQueue_shouldResultInQueueFullException(){
        MyQueueInterface<Integer> queue1000Elements = new MyQueue();
        addRandomElements(queue1000Elements, 1001);
    }

    @Test
    public void add1000ElementsToQueue_shouldBeDoable(){
        MyQueueInterface<Integer> queue1000Elements = new MyQueue();
        queue1000Elements = addRandomElements(queue1000Elements, 1000);
    }

    private MyQueueInterface addRandomElements(MyQueueInterface queue, int howManyToAdd) {
        for (int i = 0; i < howManyToAdd; ++i)
            queue.add(new Object());
        return queue;
    }
}
