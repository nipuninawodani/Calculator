package com.kelaniya.uni.v5.operation;

public class DivOperation implements Operation {

    public Double execute(Double[] numbers) {
        if (number[1]==0){
            throw new InvalidCalcOperationexception("Do not divide by zero");
        }
        return numbers[0] / numbers[1];

    }

}