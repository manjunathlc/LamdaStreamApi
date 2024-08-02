package org.example.functionalInterface;

import java.util.function.Predicate;

public class PredicateInterface {
    // Functional interface for predicate operations
    public Predicate<Integer> checkAgeToVote = age -> age>=18;



}
