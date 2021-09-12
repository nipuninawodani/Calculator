package v4.Operation;

//Factory design pattern
public class OperationFactory {
    public Operation getInstances(String operator) {

        Operation operation = null;
        if (operator.equals("add")) {
            operation = new AddOperation();
        } else if (operator.equals("sub")) {
            operation = new SubOperation();
        } else if (operator.equals("mul")) {
            operation = new MulOperation();
        }else if (operator.equals("div")) {
                operation = new MulOperation();
        }// violation of ocp -> this is a known violation
        return operation;

    }
}
