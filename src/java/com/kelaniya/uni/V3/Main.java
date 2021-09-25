package com.kelaniya.uni.V3;

import com.kelaniya.uni.V3.operation.AddOperation;
import com.kelaniya.uni.V3.operation.MulOperation;
import com.kelaniya.uni.V3.operation.SubOperation;

import java.io.IOException;

//Main class is the coordinator now...
public class Main {

    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();


        double result = 0;

        //calculating part
        if (operator.equals("add")) {
            AddOperation addOperation = new AddOperation();
            result = addOperation.execute(numbers);
        } else if (operator.equals("sub")) {
            SubOperation subOperation = new SubOperation();
            result = subOperation.execute(numbers);
        } else if (operator.equals("mul")) {
            MulOperation mulOperation = new MulOperation();
            result = mulOperation.execute(numbers);
        }

        System.out.println("The result is " + result);

    }

}