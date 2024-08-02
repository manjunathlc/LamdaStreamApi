package org.example.functionalInterface;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierInterface {
    // Functional interface for supplier operations
    // T get();
    public Supplier<String > s = ()-> Calendar.getInstance().getTime().toString();
}
