package main.java.com.preInterview;

import main.java.com.preInterview.operations.Addition;
import main.java.com.preInterview.operations.Division;
import main.java.com.preInterview.operations.Multiplication;
import main.java.com.preInterview.operations.Subtraction;

import java.util.HashMap;
import java.util.Map;

public class OperationFactory {
    public static final Map<Operation,CalculatorOperation> calOp = new HashMap<>();

    static{
        calOp.put(Operation.ADD,new Addition());
        calOp.put(Operation.SUBTRACT,new Subtraction());
        calOp.put(Operation.MULTIPLY,new Multiplication());
        calOp.put(Operation.DIVIDE,new Division());

    }


    public static CalculatorOperation getOp(Operation operation){
        return calOp.get(operation);
    }
}
