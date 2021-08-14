package com.kelaniya.uni;

import java.io.FileNotFoundException;

public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        Cal calculator= new Cal();//Creating an object from Calculator class
        calculator.user_input();
        calculator.calculating();
    }
}