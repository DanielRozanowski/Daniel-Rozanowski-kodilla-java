package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecoundChallenge secondChallenge = new SecoundChallenge();
        try {
            secondChallenge.probablyIWillThrowException(0.99,1.1);
        } catch (Exception e) {
            System.out.println("Oh no! Something went wrong! Error:" + e);
        } finally {
            System.out.println("Here is an exception!");
        }
    }
}