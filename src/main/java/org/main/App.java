package org.main;

import org.services.AnalogCaculator;
import org.services.Calculator;
import org.services.DigitalCaculator;

class Alpha{
    public void alpha(){
        System.out.println("Alpha class.");    }
}

//class Beta{
//    public  void beta(){
//        Alpha alp = new Alpha();
//        alp.alpha();
//    }
//}

class Beta extends  Alpha {
    public void beta() {
        alpha();
    }
}

// so by doing this we making both the Alpha & Beta Both tightely coupled.
public class App
{
    public static void main( String[] args )
    {
        Calculator cal = new Calculator(new AnalogCaculator()); // constracture injection
        boolean status = cal.buycalculator(599);
        cal.setType(new DigitalCaculator()); // here i'm injecting the object of the dependency class is called dependency injection and the
                                            // the injecting perform bby the setter so it is called as setter injection
        if(status)
            System.out.println("calculator purchased.");
        else
            System.out.println("calculator not purchased");
    }
}
