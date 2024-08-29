package main.java.com.preInterview;
public class Calculator {

    public int calculate(Operation operation,int first, int second){
        CalculatorOperation opFactory =OperationFactory.getOp(operation);
        if(operation == null){
            throw new UnsupportedOperationException("Cannot perform operation");
        }
        return opFactory.calculate(first,second);
    }

    public int  chainOperations(int firstValue, int[] nextValues, Operation[] operations){
        int result = firstValue;
        if(nextValues.length != operations.length){
            throw new RuntimeException();
        }
        for(int i =0 ; i < operations.length;i++){
            result = calculate(operations[i],result , nextValues[i]);
        }
        return result;
    }
}
