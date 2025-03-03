package com.o;

public class OCPMain {
    public static void main(String[] args) {
        Book fiction = new FictionBook();
        Book nonFiction = new NonFictionBook();

        PriceCalculator calculator = new PriceCalculator();
        System.out.println("Fiction Book Price: " + calculator.calculatePrice(fiction));
        System.out.println("Non-Fiction Book Price: " + calculator.calculatePrice(nonFiction));
    }
}