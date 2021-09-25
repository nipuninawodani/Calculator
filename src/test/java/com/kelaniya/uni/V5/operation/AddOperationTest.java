package com.kelaniya.uni.V5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AddOperationTest {


    // test cases
    // positive number, positive number => correct answer | 5,6 => 11
    // zero, zero => zero | 0,0 => 0
    // negative number, negative number => correct answer | -1,-2 => -3
    // negative number, positive number => correct answer | -1,2 => 1

    @Test
    public void should_add_positive_values() {

        AddOperation addOperation = new AddOperation();
        Double result = addOperation.execute(new Double[]{5.0, 6.0});

        assertThat(result, is(11.0));

    }

    @Test
    public void should_add_zeros() {

        AddOperation addOperation = new AddOperation();
        Double result = addOperation.execute(new Double[]{0.0, 0.0});

        assertThat(result, is(0.0));

    }

    @Test
    public void should_add_negatives() {

        AddOperation addOperation = new AddOperation();
        Double result = addOperation.execute(new Double[]{-2.0, -4.0});

        assertThat(result, is(-6.0));

    }

}