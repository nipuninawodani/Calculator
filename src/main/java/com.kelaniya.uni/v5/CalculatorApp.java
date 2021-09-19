package com.kelaniya.uni.v5;

import com.kelaniya.uni.V5.input.Inputs;
import com.kelaniya.uni.V5.operation.Operation;
import com.kelaniya.uni.V5.operation.OperationFactory;
import com.kelaniya.uni.V5.repository.NumberRepository;
import com.kelaniya.uni.V5.ui.UI;
import com.kelaniya.uni.v5.operation.InvalidCalcOperationexception;

import java.io.IOException;

public class CalculatorApp {

    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;

    public CalculatorApp(Inputs inputs, NumberRepository numberRepository, OperationFactory operationFactory, UI ui) {
        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute() throws IOException { //will change this in the future

        String operator = inputs.getOperator();
        Double[] numbers = numberRepository.getNumbers();
        Operation operation = operationFactory.getInstance(operator);
        Double result = null;
        try{
           result= operation.execute.numbers();
        }catch(InvalidCalcOperationexception e) {
            ui.showMessage("Error occurred!" + e.getMessage());
            return;
        }
        ui.showMessage("The result is " + result);

    }

}
