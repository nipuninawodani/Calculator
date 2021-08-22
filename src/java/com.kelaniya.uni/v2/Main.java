package v2;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        //make sure to validate the arguments before using..
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument");
            return;
        }

        String operator = args[0];

        if (!((operator.equals("add") || (operator.equals("sub") || (operator.equals("mul"))) {
            System.out.println("Please provide ass, sub or mul as the operator argument");
            return;
        }

        //read the numbers from the txt file
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("Calculator/src/java/com.kelaniya.uni/v1/numbers.txt")
        );

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        double result = 0;

        if (operator.equals("add")) {
            result = number1 + number2;
        } else if (operator.equals("sub")) {
            result = number1 - number2;
        } else if (operator.equals("mul")) {
            result = number1 * number2;
        }
        System.out.println("the result is" + result);
    }
}
