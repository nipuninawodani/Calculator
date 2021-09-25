package com.kelaniya.uni.V1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HelloWorld {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;
        // file reading part
        try {
            List<Double> numbers=new ArrayList<Double>();
            File myObj = new File("cal.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] words=data.split("\\s");
                numbers.add(Double.parseDouble(words[0]));
                numbers.add(Double.parseDouble(words[1]));

            }
            myReader.close();

            number1=numbers.get(0);
            number2=numbers.get(1);
        //calculator


        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // ask users to enter numbers
//        System.out.println("Enter first number");
//        number1 = input.nextDouble();
//
//        System.out.println("Enter second number");
//        number2 = input.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}
