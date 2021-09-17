package com.company.week7.classwork.executable;


import java.io.FileNotFoundException;

public class FactorialExecutable implements Executable {
    private int number;
    private ResultPrinter resultPrinter;

    public FactorialExecutable(int number, ResultPrinter resultPrinter) {

        this.number = number;
        this.resultPrinter = resultPrinter;
    }

    protected int Factorial(int num) {
        if (num == 0) return 1;
        return num * Factorial(num - 1);
    }

    @Override
    public void execute() throws FileNotFoundException {
        resultPrinter.print(String.valueOf(Factorial(number)));
    }

    @Override
    public ExecutableType getType() {
        return ExecutableType.FACTORIAL_EXECUTABEL;
    }
}
