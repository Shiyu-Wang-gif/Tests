import java.util.Scanner;
import java.util.ArrayList;

public class TestArraySort {
	// method
	private static ArraySort createObject() {
		Scanner sc = new Scanner(System.in);
		int length, lowerBound, upperBound;
		
		System.out.print("Enter the array length: ");
		length = sc.nextInt();
		System.out.print("Array lower bound: ");
		lowerBound = sc.nextInt();
		System.out.print("Array upper bound: ");
		upperBound = sc.nextInt();
		System.out.println();
		
		return new ArraySort(length, lowerBound, upperBound);
	}
	
	private static void display(ArraySort arraySort) {
		System.out.print("Array: ");
		arraySort.displayArray();
		System.out.print("Copy : ");
		arraySort.displayArrayCopy();
		System.out.println();
	}
	
	// main
	public static void main(String[] args) {
		ArraySort arraySort = createObject();
		System.out.println("Generate a random array");
		arraySort.generateRandomArray();
		display(arraySort);
		
		System.out.println("Refresh the array copy");
		arraySort.refreshArrayCopy();
		display(arraySort);
		
		System.out.println("The bubble sort");
		arraySort.bubbleSort();
		display(arraySort);
		
		System.out.println("The selection sort");
		arraySort.refreshArrayCopy();
		arraySort.selectionSort();
		display(arraySort);
		
		System.out.println("The insertion sort");
		arraySort.refreshArrayCopy();
		arraySort.insertionSort();
		display(arraySort);
		
		System.out.println("The merge sort");
		arraySort.refreshArrayCopy();
		arraySort.setArrayCopy(arraySort.mergeSort(arraySort.getArrayCopy()));
		display(arraySort);
		
		System.out.println("The quick sort");
		arraySort.refreshArrayCopy();
		arraySort.quickSort(arraySort.getArrayCopy(), 0, arraySort.getLength() - 1);
		display(arraySort);
		
		System.out.println("The Shell sort");
		arraySort.refreshArrayCopy();
		arraySort.shellSort();
		display(arraySort);
		
		System.out.println("The counting sort");
		arraySort.refreshArrayCopy();
		arraySort.countingSort();
		display(arraySort);
		
		System.out.println("The radix sort");
		arraySort.refreshArrayCopy();
		arraySort.radixSort();
		display(arraySort);
		
		System.out.println("The heap sort");
		arraySort.refreshArrayCopy();
		arraySort.heapSort();
		display(arraySort);
		
		System.out.println("The bucket sort");
		arraySort.refreshArrayCopy();
		ArrayList<Integer> arrayCopyList = arraySort.generateArrayCopyList();
		arraySort.bucketSort(arrayCopyList, 4);
		arraySort.refreshArrayCopyByArrayList(arrayCopyList);
		display(arraySort);
	}
	
	// static code blcok
	static {
		System.out.println("Sort an array in various ways");
		System.out.println("===============================================");
	}
}