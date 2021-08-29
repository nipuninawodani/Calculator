package v3;

import v3.Operation.AddOperation;
import v3.Operation.MulOperation;
import v3.Operation.SubOperation;

public class Main {

    //Main method is the coordinator now......

    public static void main(String[] args) throws Exception {
        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumber();
        Double number1 = numbers[0];
        Double number2 = numbers[1];

        double result = 0;

        //or use switch case
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
        System.out.println("the result is" + result);
    }
}