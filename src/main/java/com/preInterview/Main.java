package main.java.com.preInterview;

import main.java.com.preInterview.operations.Addition;

public class Main {

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        Addition add = new Addition();
        double result =calculator.calculate(Operation.ADD,1,2);
        System.out.println(result);
    }
}
