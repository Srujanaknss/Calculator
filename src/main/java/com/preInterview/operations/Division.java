package main.java.com.preInterview.operations;

import main.java.com.preInterview.CalculatorOperation;

public class Division implements CalculatorOperation {

    private int first;

    private int second;

    private int result;

    public Division() {

    }

    public Division(int first, int second) {
        this.first = first;
        this.second = second;
        this.result = this.first / this.second;
    }


    public int calculate(int first, int second) {
        this.result = first / second;
        return this.result;
    }
}
