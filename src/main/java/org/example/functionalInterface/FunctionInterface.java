package org.example.functionalInterface;

import java.util.Calendar;
import java.util.function.Function;

public class FunctionInterface {
    // Functional interface for function operations
    // R apply(T t);
    public Function<String,String> f = (name)->name+"-"+ Calendar.getInstance().getTime().toString();

}
