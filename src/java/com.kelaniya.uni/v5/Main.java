package v5;

import v4.Operation.*;

import java.com.kelaniya.uni.v5.CalculatorApp;
import java.com.kelaniya.uni.v5.UI.CmdLineUI;
public class Main {

    //Main method is the coordinator now......
    public static void main(String[] args) throws Exception {
        Inputs inputs = new Inputs(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory();
        UI ui = new CmdLineUI();
        CalculatorApp app = new CalculatorApp(inputs, numberRepository,operationFactory, ui);
        app.execute();
    }

}