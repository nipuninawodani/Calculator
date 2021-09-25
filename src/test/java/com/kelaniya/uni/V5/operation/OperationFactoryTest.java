package com.kelaniya.uni.V5.operation;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class OperationFactoryTest {

//test cases

    //1.If the operator is add should return a object of AddOperation class.
    @Test
    public void should_return_AddOperation_object_when_operator_is_add() {
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("add");

        //verify that the operation object is an instance of AddOperation class
        assertThat(operation, instanceOf(AddOperation.class));
    }
    //2.If the operator is sub should return a object of SubOperation class.
    @Test
    public void should_return_Operation_object_when_operator_is_sub() {
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("sub");

        //verify that the operation object is an instance of AddOperation class
        assertThat(operation, instanceOf(SubOperation.class));

    //3.If the operator is mull should return a object of MulOperation class.
        @Test
        public void should_return_MulOperation_object_when_operator_is_mul() {
            OperationFactory operationFactory = new OperationFactory();
            Operation operation = operationFactory.getInstance("mul");

            //verify that the operation object is an instance of AddOperation class
            assertThat(operation, instanceOf(MulOperation.class));

    //4.If the operator is div should return a object of DivOperation class.
            @Test
            public void should_return_DivOperation_object_when_operator_is_div() {
                OperationFactory operationFactory = new OperationFactory();
                Operation operation = operationFactory.getInstance("div");

                //verify that the operation object is an instance of AddOperation class
                assertThat(operation, instanceOf(DivOperation.class));
}