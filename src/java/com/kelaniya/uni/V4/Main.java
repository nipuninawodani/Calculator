package com.kelaniya.uni.V4;

import com.kelaniya.uni.V4.operation.Operation;
import com.kelaniya.uni.V4.operation.OperationFactory;

import java.io.IOException;

//Main class is the coordinator now...
public class Main {

    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();


        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);

        UI ui = new UI();
        ui.showMessage("The result is " + result);

    }

}