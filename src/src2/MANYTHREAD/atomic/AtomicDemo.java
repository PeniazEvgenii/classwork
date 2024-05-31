package MANYTHREAD.atomic;

import sun.misc.Unsafe;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicDemo {
    public static void main(String[] args) {
        int value = 5;
        AtomicInteger atomicInteger = new AtomicInteger();

        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(5);
        int i = atomicInteger.incrementAndGet();
        System.out.println(i);
    }
}
