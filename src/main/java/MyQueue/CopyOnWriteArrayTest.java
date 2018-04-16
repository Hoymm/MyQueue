package MyQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayTest {

    public static void main(String[] args) {

        for (int i = 0; i < 10; ++i){
            List <Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            List <Integer> arrayList = new ArrayList<>();
            List <Integer> linkedList = new LinkedList<>();
            List <Integer> vector = new Vector<>();
            addElementsCountTime(copyOnWriteArrayList);
            addElementsCountTime(arrayList);
            addElementsCountTime(linkedList);
            addElementsCountTime(vector);
            System.out.println();
        }
    }

    private static void addElementsCountTime(List list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100000; ++i)
            list.add(i);
        System.out.println(list.getClass().getName() + ", timing: " + (System.currentTimeMillis()-time));
    }
}
