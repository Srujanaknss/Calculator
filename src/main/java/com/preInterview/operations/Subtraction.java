package main.java.com.preInterview.operations;

import main.java.com.preInterview.CalculatorOperation;

public class Subtraction implements CalculatorOperation {

    private int first;

    private int second;

    private int result;
    public int calculate(int first, int second){
        result = first-second;
        return result;

    }
}
