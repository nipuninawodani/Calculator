package com.kelaniya.uni.v1;

import java.io.File; //To read from file
import java.io.FileNotFoundException;//For exception handling in reading from text file
import java.util.Scanner;//To obtain user input and to read from file

public class Cal {
    String method;//For calculation method
    int i, result;
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[2];//An array to store numbers reading from the file

    //Obtain user input for the calculation method
    public void user_input() {
        System.out.println("Addition :- add" + "\n" + "Subtraction :- sub" + "\n" + "Multiplication :- mul" + "\n" + "Division :- div");
        System.out.println("Enter the calculation method you want:");
        method = input.nextLine();
    }

    //Obtain two numbers from the file
    public void number_reading() throws FileNotFoundException {
        File file = new File("Calculator/src/java/com.kelaniya.uni/numbers.txt");
        input = new Scanner(file);
        while (input.hasNext()) {
            for (i = 0; i < 2; i++) {
                numbers[i] = input.nextInt();
            }
        }
    }

    //Calculating the result based on user input given for the calculation method
    public void calculating() throws FileNotFoundException {
        number_reading();
        i = 0;
        switch (method) {
            case "add":
                result = numbers[i] + numbers[i + 1];
                break;
            case "sub":
                result = numbers[i] - numbers[i + 1];
                break;
            case "mul":
                result = numbers[i] * numbers[i + 1];
                break;
            case "div":
                result = numbers[i] / numbers[i + 1];
                break;
        }
        System.out.println("Result :- " + result);
    }
}