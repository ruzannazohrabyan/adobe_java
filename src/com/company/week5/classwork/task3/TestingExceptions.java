
package com.company.week5.classwork.task3;


public class TestingExceptions {

    public static void main(String[] args) {
//        Integer result=null;
//        System.out.println("********");
//
////        result = calculate(-10, 20);
//        try {
//            result = calculate(-10, 20);
//        } catch (StackOverflowError | Exception exception) {
//            //exception.printStackTrace();
//        }
//        System.out.println(result);

        //method1();
    }

    public static void method1() throws Exception {
        calculate(-5, 4);
    }

    public static Integer calculate(int a, int b) throws Exception {

        if (a < 00) {
            throw new Exception();
        }
        return null;

//            return calculate(5, 5);
//            RuntimeException ex = new RuntimeException();
//            throw ex;
//            throw new Exception();

        //return null;
    }
}
