package com.company.week4.classwork.task1;

public class LineProgressAware extends ProgressAware {
    private final int lineLength;

    public LineProgressAware(int lineLength) {
        if(lineLength<=0) {
            throw new RuntimeException();
        }
        this.lineLength = lineLength;
    }

    @Override
    public void print(long p) {
        System.out.println((p *lineLength)/100 + " Line length");
    }
}
