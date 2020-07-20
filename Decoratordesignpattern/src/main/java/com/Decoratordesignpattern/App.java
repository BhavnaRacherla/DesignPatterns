package com.Decoratordesignpattern;

/**
 * Hello world!
 *
 */
public class App 
{
  
    	public static void main(String[] args) {
    		Car sportsCar = new SportsCar(new BasicCar());
    		sportsCar.assemble();
    		System.out.println("\n*****");
    		BasicCar b =new BasicCar();
    		LuxuryCar l=new LuxuryCar(b);
    		Car sportsLuxuryCar = new SportsCar(l);
    		sportsLuxuryCar.assemble();
    	}

    
}
