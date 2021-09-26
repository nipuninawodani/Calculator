package com.kelaniya.uni.V5;

import com.kelaniya.uni.V5.input.Inputs;
import com.kelaniya.uni.V5.input.invalidInputException;
import com.kelaniya.uni.V5.operation.InvalidOperationException;
import com.kelaniya.uni.V5.operation.Operation;
import com.kelaniya.uni.V5.operation.OperationFactory;
import com.kelaniya.uni.V5.repository.NumberRepository;
import com.kelaniya.uni.V5.repository.NumberRepositoryException;
import com.kelaniya.uni.V5.ui.UI;

import java.io.IOException;

public class CalculatorApp<InvalidCalcOperationException> {

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

    public void execute() throws invalidInputException, NumberRepositoryException, InvalidOperationException { //will change this in the future
        try {
        String operator = inputs.getOperator();
        Double[] numbers = numberRepository.getNumbers();
        Operation operation = operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);
        ui.showMessage("The result is " + result);
        } catch (InvalidCalcOperationException | invalidInputException| NumberRepositoryException {
            ui.showMessage("Error Occurred! " + e.getMessage());
       }
    }

}