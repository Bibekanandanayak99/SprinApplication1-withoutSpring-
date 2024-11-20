package org.services;

public class Calculator {
    public Shop getType() {
        return type;
    }

    public Calculator(Shop type) {
        this.type = type;
    }

    public void setType(Shop type) { // Shop shop = new DigitalCalculator(polymorphism)
        this.type = type;
    }

    private  Shop type;




    public  boolean buycalculator(double amount){
//        DigitalCaculator dcal = new DigitalCaculator();
//        return dcal.sellCalucator(5600);
        return  type.sellCalucator(amount);
    }
}
