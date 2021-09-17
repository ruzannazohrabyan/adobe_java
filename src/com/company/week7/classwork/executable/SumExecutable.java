package com.company.week7.classwork.executable;


import java.io.FileNotFoundException;

public class SumExecutable implements Executable{
    private final int number;
    private final ResultPrinter resultPrinter;

    public SumExecutable(int number, ResultPrinter resultPrinter){

        this.number = number;
        this.resultPrinter = resultPrinter;
    }

    private int sumOf(int num) {
        if(num == 0) return 0;
        return num + sumOf(num-1);
    }

    @Override
    public void execute() throws FileNotFoundException {
        resultPrinter.print(String.valueOf(sumOf(number)));
    }

    @Override
    public ExecutableType getType() {
        return ExecutableType.SUM_EXECUTABLE;
    }
}
