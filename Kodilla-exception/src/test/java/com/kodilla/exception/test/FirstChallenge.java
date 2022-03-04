package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        } else return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) throws ArithmeticException {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("You can not divide by 0!!!");
        } finally {
            System.out.println("finally");
        }


    }
}
