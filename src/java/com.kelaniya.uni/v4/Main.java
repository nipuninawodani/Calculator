package v4;

import v4.Operation.*;
//LISKOV Substitution method
public class Main {

    //Main method is the coordinator now......
    public static void main(String[] args) throws Exception {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumber();

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstances(operator);
        Double result = operation.execute(numbers);

        UI ui = new UI();
        ui.showMessage("the result is" + result);
    }

    // EXTENSIBILITY -> how easy to add new thing
    //SOLID -> done
    //Coupling and Cohesion
    //naming best practices
    //Unit testing -> *****
    //working with functions -> best practices
}