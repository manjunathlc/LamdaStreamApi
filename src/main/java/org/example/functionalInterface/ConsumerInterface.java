package org.example.functionalInterface;

import java.util.function.Consumer;

public class ConsumerInterface {
    // Functional interface for consumer operations
    //void accept(T t);
    public Consumer<Integer> c= number-> System.out.println(number/2);
}
