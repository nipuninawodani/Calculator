package com.kelaniya.uni;

import java.io.*;
public class Main
{
    public static void main(String[] args) throws Exception {

        File file = new File("Calculator/src/java/com.kelaniya.uni/numbers.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }

}