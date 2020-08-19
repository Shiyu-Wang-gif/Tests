/*
Author: Shiyu Wang
Function: implement factorial by recursion
*/
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.print("n = ");
		Scanner inputScanner = new Scanner(System.in);
		int n = inputScanner.nextInt();
		System.out.println(n + "! = " + factorialN(n));
	}
	
	public static int factorialN (int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		else {
			return n * factorialN(n - 1);
		}
	}
}