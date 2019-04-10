package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hey");
        System.out.println("Hello, new additional branch number two");
        System.out.println("String for additional branch");
        new Main().example("Ничего");
    }

    private void example(String text){
        System.out.println(text);
    }
}
