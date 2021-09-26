package com.kelaniya.uni.V5.input;

public class CommandLineInputs implements Inputs {

    private final String[] args;

    //Constructor of the class
    public CommandLineInputs(String[] arguments) {
        this.args = arguments;
    }

    public String getOperator() throws invalidInputException {
        // Validating the arguments before using
        if (args.length == 0) {
            throw new invalidInputException ("Please provide the operator as an argument");
        }
        String operator = args[0];
        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div"))) {
            throw new invalidInputException("Please provide add, sub or mul as the operator argument");
        }

        return operator; //will change in the future
    }
}
