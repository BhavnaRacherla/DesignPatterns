package com.Proxydesignpattern;

/**
 * Hello world!
 *
 */
public class App 
{
    
    	public static void main(String[] args){
    		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
    		try {
    			executor.runCommand("ls -ltr");
    			executor.runCommand(" rm -rf abc.pdf");
    		} catch (Exception e) {
    			System.out.println("Exception Message::"+e.getMessage());
    		}
    		
    	}

    
}
