package org.services;

public class AnalogCaculator implements  Shop{

    public boolean sellCalucator( double price) {
        System.out.println("AnalogeCaculator is sold at price of: "+price);

        return true;
    }
}
