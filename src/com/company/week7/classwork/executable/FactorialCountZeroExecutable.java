package com.company.week7.classwork.executable;


import java.io.FileNotFoundException;

public class FactorialCountZeroExecutable extends FactorialExecutable {

    private final int number;
    private final ResultPrinter resultPrinter;

    public FactorialCountZeroExecutable(int number, ResultPrinter resultPrinter) {
        super(number, resultPrinter);
        this.number = number;
        this.resultPrinter = resultPrinter;
    }


    private int countOfZeroFactorial() {
        int factorialNumber = Factorial(number);
        int count = 0;
        while (factorialNumber > 0) {
            if (factorialNumber % 10 == 0) {
                count++;
            }
            factorialNumber = factorialNumber / 10;
        }

        return count;
    }


    @Override
    public void execute() throws FileNotFoundException {
        resultPrinter.print(String.valueOf(countOfZeroFactorial()));
    }

    @Override
    public ExecutableType getType() {
        return ExecutableType.FACTORIAL_COUNT_ZERO_EXECUTABLE;
    }
}
