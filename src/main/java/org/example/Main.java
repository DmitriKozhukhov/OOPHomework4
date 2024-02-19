package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Integer [] arrInt = {1,2,3};
        Double [] arrDouble = {1.0,2.5,3.0};
        List<Integer> integers = new ArrayList<>(Arrays.asList(arrInt));
        List<Double> doubles = new ArrayList<>(Arrays.asList(arrDouble));
        System.out.println("calculator.sum(integers) = " + calculator.sum(integers));
        System.out.println("calculator.sum(doubles) = " + calculator.sum(doubles));
        System.out.println("calculator.multipl(integers) = " + calculator.multipl(integers));
        System.out.println("calculator.multipl(doubles) = " + calculator.multipl(doubles));
        System.out.println("calculator.division(integers, 1000) = " + calculator.division(integers, 1000));
        System.out.println("calculator.division(doubles, 1000) = " + calculator.division(doubles, 1000));
        System.out.println("calculator.decToBin(5) = " + calculator.decToBin(5));
        System.out.println("calculator.decToBin(5) = " + calculator.decToBin(6.7845));
        System.out.println("calculator.decToBin(\"14\") = " + calculator.decToBin("14"));
    }
}