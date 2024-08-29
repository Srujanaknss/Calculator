package test.java.com.preInterview;

import main.java.com.preInterview.Calculator;
import main.java.com.preInterview.Operation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    @Test
    public void testBasicOperations() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.calculate(Operation.ADD, 2, 3));
        assertEquals(-1, calc.calculate(Operation.SUBTRACT, 2, 3));
        assertEquals(6, calc.calculate(Operation.MULTIPLY, 2, 3));
        assertEquals(2, calc.calculate(Operation.DIVIDE, 6, 3));
    }

    @Test
    public void testChainingOperations() {
        Calculator calc = new Calculator();
        Operation[] operations = { Operation.ADD, Operation.MULTIPLY };
        int[] values = { 3, 2 };
        assertEquals(16, calc.chainOperations(5, values, operations));
    }

    @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> calc.calculate(Operation.DIVIDE, 1, 0));
    }

    @Test
    public void testUnsupportedOperation() {
        Calculator calc = new Calculator();
        assertThrows(UnsupportedOperationException.class, () -> calc.calculate(null, 1, 1));
    }
}
