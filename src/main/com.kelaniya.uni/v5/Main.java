package com.kelaniya.uni.V5;

import com.kelaniya.uni.V5.input.CommandLineInputs;
import com.kelaniya.uni.V5.input.Inputs;
import com.kelaniya.uni.V5.operation.OperationFactory;
import com.kelaniya.uni.V5.repository.FileNumberRepository;
import com.kelaniya.uni.V5.repository.NumberRepository;
import com.kelaniya.uni.V5.ui.CmdLineUI;
import com.kelaniya.uni.V5.ui.UI;

import java.io.IOException;

//Main class is the coordinator now...
public class Main {

    public static void main(String[] args) throws IOException {

        Inputs inputs = new CommandLineInputs(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory();
        UI ui = new CmdLineUI();
        CalculatorApp app = new CalculatorApp(inputs, numberRepository, operationFactory, ui);
        app.execute();

    }

}