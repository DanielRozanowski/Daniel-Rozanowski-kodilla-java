package com.kodilla.stream.beautifier;

public class PoemBeautifier {
   public void poetBeautifier(String a, PoeamDecorator poeamDecorator) {
       String result = poeamDecorator.decorate(a);
       System.out.println("Result" + result);
   }
}
