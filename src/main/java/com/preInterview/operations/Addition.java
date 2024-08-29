package main.java.com.preInterview.operations;

import main.java.com.preInterview.CalculatorOperation;

public class Addition implements CalculatorOperation {

    private int first;

    private int second;

    public Addition(){

    }

    public Addition(int first,int second){
        this.first =first;
        this.second =second;
        this.result = this.first+this.second;
    }

    private int result;
    public int calculate(int first, int second){
        this.result = first+second;
        return this.result;
    }
}
