package org.example;

import java.util.List;
import java.util.Objects;

public class Calculator {

    public Calculator() {
    }

    public double sum(List<? extends Number> numbers) {
        double result = 0;

        for (Number number : numbers) {
            result += number.doubleValue();
        }

        return result;
    }

    public double multipl(List<? extends Number> numbers) {
        double result = 0;

        for (Number number : numbers) {
            result += number.doubleValue();
        }

        return result;
    }

    public double division(List<? extends Number> numbers, double divid) {
        double results = divid;

        for (Number number : numbers) {
            results /= number.doubleValue();
        }

        return results;
    }

    public String decToBin(Object arg) {
        StringBuilder stringBuilder = new StringBuilder();
        if ((arg instanceof Number)) {
            stringBuilder.append(Integer.toBinaryString(((Number) arg).intValue()));
            if (arg instanceof Double) {
                stringBuilder.append('.');
                double den = ((Double) arg).doubleValue() % 1;
                for (int i = 0; i < 5; i++) {
                    den = den * 2 - (int) den * 2;
                    stringBuilder.append((int) den);
                }
            }
        }
        if (arg instanceof String) {
            for (int i = 0; i < ((String) arg).length(); i++) {
                stringBuilder.append(Integer.toBinaryString(((String) arg).charAt(i)));
            }
        }

        return stringBuilder.toString();
    }
}
