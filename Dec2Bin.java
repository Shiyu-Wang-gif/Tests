/*
Author: Shiyu Wang
Funtion: Convert a decimal number to a binary number
Created at 2020/8/18
*/
import java.util.Scanner;

public class Dec2Bin {
	public static void main(String[] args) {
		// declare variables
		Scanner inputScanner = new Scanner(System.in);
		int inputNumber, decNumber, quotient, remainder;
		String binNumber = "";
		
		// scan input number from cmd
		System.out.print("Enter the number to be converted: ");
		inputNumber = inputScanner.nextInt();
		decNumber = inputNumber;
		
		// convert a decimal number to a binary number
		do {
			quotient = decNumber / 2;
			remainder = decNumber % 2;
			binNumber = remainder + binNumber;
			decNumber = quotient;
		} while (quotient > 0);
		
		// output results
		System.out.println(decNumber + " ---> " + binNumber);
	}
}