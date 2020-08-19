/*
Author: Shiyu Wang
Function: Generate the Fibonacci sequence by recursion
Created at 2020/8/19
*/

public class FibonacciSequence {
	public static void main(String[] args) {
		final int length = 10;
		
		for (int i = 0; i < length; i = i + 1) {
			System.out.print(element(i + 1) + " ");
		}
	}
	
	public static int element(int sequenceNumber) {
		if (sequenceNumber == 1 || sequenceNumber == 2) {
			return 1;
		}
		else {
			return element(sequenceNumber - 1) + element(sequenceNumber - 2);
		}
	}
}