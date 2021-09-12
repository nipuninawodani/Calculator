package java.com.kelaniya.uni.v5.Input;

public class CommandLineInputs{

    //constructor of the class
    public CommandLineInputs(String[] arguments) {
        this.args = arguments;
    }

    public String getOperator() {
        //make sure to validate the arguments before using..
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument");
            return ""; //have to change
        }

        //open close principle violated here
        String operator = args[0];
        if (!((operator.equals("add") || operator.equals("sub") || operator.equals("mul")|| operator.equals("div")))) {
            System.out.println("Please provide ass, sub or mul as the operator argument");
            return ""; //have to change
        }
        return operator;
    }
}