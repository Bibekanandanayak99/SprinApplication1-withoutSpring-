package org.services;

public class DigitalCaculator implements  Shop {
    public boolean sellCalucator(double price) {
        System.out.println("DigitalCaculator is sold at price of: "+price);
        return true;
    }
}
