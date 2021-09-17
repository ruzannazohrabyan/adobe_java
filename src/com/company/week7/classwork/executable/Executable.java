package com.company.week7.classwork.executable;

import java.io.FileNotFoundException;

public interface Executable {
    void execute() throws FileNotFoundException;
    ExecutableType getType();
}
