/*
Author: Shiyu Wang
Function: Determine whether a number is prime
Created at 2020/8/18
*/
import java.util.Scanner;

public class PrimeNumberDetermination {
	public static void main(String[] args) {
		// declare variables
		int inputNumber, searchUpBound, i;
		boolean flag = true;
		Scanner inputScanner = new Scanner(System.in);
		
		// scan input number from the cmd
		System.out.print("Enter the number to be determined: ");
		inputNumber = inputScanner.nextInt();
		
		// determination
		if (inputNumber < 1) {
			System.out.println("Invalid input!");
		}
		else if (inputNumber == 1) {
			flag = true;
		}
		else {
			searchUpBound = (int)Math.sqrt(inputNumber);
			System.out.println("searchUpBound: " + Math.sqrt(inputNumber) + ", " + searchUpBound);
			for (i = 2; i <= searchUpBound; i = i + 1) {
				if(inputNumber % i == 0) {
					flag = false;
					break;
				}
			}
		}
		
		// output results
		if (flag) {
			if (inputNumber >= 1) {
				System.out.println("Prime number");
			}
		}
		else {
			System.out.println("Not prime number");
		}
	}
}