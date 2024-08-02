package org.example;

import org.example.functionalInterface.ConsumerInterface;
import org.example.functionalInterface.FunctionInterface;
import org.example.functionalInterface.PredicateInterface;
import org.example.functionalInterface.SupplierInterface;
import org.example.streamapi.Employees;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Functional interface for predicate operations

    public static void main(String[] args){

        PredicateInterface predicateInterface = new PredicateInterface();

        System.out.println("Predicate interface example: Checking age to vote");
        System.out.println(predicateInterface.checkAgeToVote.test(17)); // false
        System.out.println(predicateInterface.checkAgeToVote.test(18)); // true


        System.out.println("\nConsumer interface example: Dividing by 2");
        ConsumerInterface consumerInterface = new ConsumerInterface();
        consumerInterface.c.accept(10); // 5

        System.out.println("\nSupplier interface example: Getting current date and time");
        SupplierInterface supplierInterface = new SupplierInterface();
        System.out.println(supplierInterface.s.get()); // Current date and time

        System.out.println("\nFunction interface example: Concatenating string");
        FunctionInterface functionInterface = new FunctionInterface();
        System.out.println(functionInterface.f.apply("Manju")); //


        //Stream API example
        Employees employee1 = new Employees(1L, "John Doe", 30, 150000.0, "Sales");
        Employees employee2 = new Employees(2L, "Jane Smith", 28, 120000.0, "Marketing");
        Employees employee3 = new Employees(3L, "David Johnson", 35, 180000.0, "Finance");
        Employees employee4 = new Employees(4L, "Michael Wilson", 25, 100000.0, "Sales");
        Employees employee5 = new Employees(5L, "Emily Davis", 32, 160000.0, "Marketing");
        Employees employee6 = new Employees(6L, "Sarah Thompson", 37, 200000.0, "Finance");

        List<Employees> e1= Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6);

        Predicate<Employees> filterByDepartment = e -> e.getDepartment().equals("Sales");

        List<Employees> filteredEmployees = e1.stream().filter(filterByDepartment).toList();

        System.out.println("\nEmployees in Sales department:");
        filteredEmployees.forEach(System.out::println); // Output: Employees in Sales department: [John Doe, Michael Wilson]

        List<Employees> employeeSalariesMoreThan = e1.stream().filter(e->e.getSalary()>150000).toList();

        System.out.println("\nEmployees earning more than $150,000:");
        employeeSalariesMoreThan.forEach(System.out::println); // Output: Employees earning more than $150,000: [David Johnson, Emily Davis, Sarah Thompson]



    }
}