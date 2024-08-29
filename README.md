This is a simple calculator project that performs basic operations like Addition, Subtraction, Multiplication,Division.

How to Run:
 Check out the project and run below command on parent directory

```mvn clean install```


Project and Functionality:

This project has two main functions
1. Calculate
  This function takes three params and returns the result of the operation.
  Params: Operation,Int,Int
  Return Type: Int
  Current operations supported:
  1.Addition
  2.Subtraction
  3.Multiplication
  4.Division

2. chainOperations 
This function that takes 3 params and returns the result of the operation in order
   Params: Int,Int[],Operations[]
   1.first value
   2.Array of remaining values
   3.Array of operations

   Return Type: Int

Tests:
All the tests were written under test directory


Design Principles:
This project is developed on open closed principle.No changes needed in calculator class if we are adding a new functionality to the calculator class

Steps to Implement new operation/functionality
1.Add the new operation the enum- ```Operation```
2.Add new class file with new operation and implement it from the calculatorOperation Interface
3.Add the new class object to the Operation Factory class
4.Add the test cases and verify the test case
5.Once all the above steps are implemented update the read me with the new operation.


