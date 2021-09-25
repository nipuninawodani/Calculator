package com.kelaniya.uni.V2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        // Validating the arguments before using
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument");
            return;
        }

        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))) {
            System.out.println("Please provide add, sub or mul as the operator argument");
            return;
        }

        //File reading
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("C:\\Users\\Pasan Devin\\Desktop\\Calculator\\numbers.txt")
        );

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        double result = 0;

        //calculating part
        if (operator.equals("add")) {
            result = number1 + number2;
        } else if (operator.equals("sub")) {
            result = number1 - number2;
        } else if (operator.equals("mul")) {
            result = number1 * number2;
        }

        System.out.println("The result is " + result);

    }

}