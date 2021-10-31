package com.kodilla.testing.collection;


import java.util.*;
public class OddNumbersExterminator {


    public List<Integer> exterminate(List<Integer> numbers){
        List <Integer> oddNumbers = new ArrayList<>();


        if (!numbers.isEmpty()) {
            for (int number : numbers) {
                if (number % 2 == 0){
                   oddNumbers.add(number);
                }
            }

        }else{System.out.print("No numbers");}
        return oddNumbers;

    }




}
