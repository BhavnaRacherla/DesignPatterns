package com.designpatterns1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Computer comp = new Computer.ComputerBuilder(
				"500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
    }
}
