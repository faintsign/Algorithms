/*
 * File: HelloGoodbye.java
 * Project: Algorithms
 * Date: 05/02/22
 * Author: Faint
 * 
 * Description:
 * A program that takes two command line arguments and prints hello and goodbye messages
 */

public class HelloGoodbye {
	public static void main(String[] args) {
		// Outputs the text Hello and goodbye added with two command-line arguments
		System.out.println("Hello " + args[0] + " and " + args[1] + ".");
		System.out.println("Goodbye " + args[1] + " and " + args[0] + ".");
	}

}
