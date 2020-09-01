import java.util.Arrays;
import java.util.ArrayList;

public class ArraySort {
	// field
	private int length;
	private int lowerBound;
	private int upperBound;
	private int[] array;
	private int[] arrayCopy;
	
	// constructor
	public ArraySort() {
		
	}
	
	public ArraySort(int length, int lowerBound, int upperBound) {
		this.setLength(length);
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.array = new int[this.length];
		this.arrayCopy = new int[this.length];
	}
	
	// setter and getter
	public void setLength(int length) {
		if (length > 1) {
			this.length = length;
		}
		else {
			this.length = 2;
			System.out.println("Invalid length! It is set as 2.");
		}
	}
	
	public int getLength() {
		return this.length;
	}
	
	public void setLowerBound(int lowerBound) {
		this.lowerBound = lowerBound;
	}
	
	public int getLowerBound() {
		return this.lowerBound;
	}
	
	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}
	
	public int getUpperBound() {
		return this.upperBound;
	}
	
	public void setArrayCopy(int[] array) {
		this.arrayCopy = array;
	}
	
	public int[] getArrayCopy() {
		return this.arrayCopy;
	}
	
	// method
	public void generateRandomArray() {
		for (int i = 0; i < this.length; i = i + 1) {
			this.array[i] = (int)(Math.random() * (this.upperBound - this.lowerBound + 1)) + this.lowerBound;
		}
	}
	
	public void refreshArrayCopy() {
		for (int i = 0; i < this.length; i = i + 1) {
			this.arrayCopy[i] = this.array[i];
		}
	}
	
	public void displayArray() {
		for (int i = 0; i < this.length; i = i + 1) {
			System.out.print(this.array[i] + " ");
		}
		System.out.println();
	}
	
	public void displayArrayCopy() {
		for (int i = 0; i < this.length; i = i + 1) {
			System.out.print(this.arrayCopy[i] + " ");
		}
		System.out.println();
	}
	
	public void bubbleSort() {
		int temp;
		int[] array = this.arrayCopy;
		
		for (int i = 0; i < (array.length - 1); i = i + 1) {
			for (int j = 0; j < (array.length - 1 - i); j = j + 1) {
				if (array[j] > array[j+1]) {
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public void selectionSort() {
		int[] array = this.arrayCopy;
		int minValue, minIndex;
		for (int i = 0; i < (array.length - 1); i = i + 1) {
			// initialization
			minValue = array[i];
			minIndex = i;
			
			// search the minimum
			for (int j = (i + 1); j < array.length; j = j + 1) {
				if (array[j] < minValue) {
					minValue = array[j];
					minIndex = j;
				}
			}
			
			// swap
			array[minIndex] = array[i];
			array[i] = minValue;
		}
	}
	
	public void insertionSort() {
		int[] array = this.arrayCopy;
		int insertionNumber, j;
		for (int i = 1; i < array.length; i = i + 1) {
			insertionNumber = array[i];
			for (j = (i - 1); (j >= 0) && (insertionNumber < array[j]); j = j - 1) {
				array[j + 1] = array[j];
			}
			array[j + 1] = insertionNumber;
		}
	}
	
	private int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		int resultIndex = 0, leftIndex = 0, rightIndex = 0;
		while ((leftIndex < left.length) && (rightIndex < right.length)) {
			result[resultIndex++] = (left[leftIndex] < right[rightIndex]) ? left[leftIndex++] : right[rightIndex++];
		}
		while (leftIndex < left.length) {
			result[resultIndex++] = left[leftIndex++];
		}
		while (rightIndex < right.length) {
			result[resultIndex++] = right[rightIndex++];
		}
		return result;
	}
	
	public int[] mergeSort(int[] array) {
		if (array.length > 1) {
			int mid = array.length / 2;
			int[] left = Arrays.copyOfRange(array, 0, mid);
			int[] right = Arrays.copyOfRange(array, mid, array.length);
			left = mergeSort(left);
			right = mergeSort(right);
			array = merge(left, right);
		}
		return array;
	}
	
	private void swap(int[] array, int i, int j) {
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}
	
	private int partition(int[] array, int start, int end) {
		int pivot = (int)(start + (end - start + 1) * Math.random());
		swap(array, pivot, start);
		int m = start;
		for (int k = start + 1; k <= end; k = k + 1) {
			if (array[k] < array[start]) {
				m = m + 1;
				swap(array, m, k);
			}
		}
		swap(array, start, m);
		return m;
	}
	
	public void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int m = partition(array, start, end);
			quickSort(array, start, m - 1);
			quickSort(array, m + 1, end);
		}
	}
	
	public void shellSort() {
		int[] array = this.arrayCopy; 
		int temp, j;
		int gap = array.length / 2;
		while (gap > 0) {
			for (int start = 0; start < gap; start = start + 1) {
				// insertion sort
				for (int i = start + gap; i < array.length; i = i + gap) {
					temp = array[i];
					for (j = i - gap; (j >= start) && (temp < array[j]); j = j - gap) {
						array[j + gap] = array[j];
					}
					array[j + gap] = temp;
				}
			}
			gap = gap / 2;
		}
	}
	
	public void countingSort() {
		// assumption: array items are integers with small range
		int[] array = this.arrayCopy;
		
		// find the min and max value of the array
		int minValue = array[0];
		int maxValue = array[0];
		for (int i = 1; i < array.length; i = i + 1) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		
		// count
		int countingArrayLength = maxValue - minValue + 1;
		int[] countingArray = new int[countingArrayLength];
		for (int i = 0; i < array.length; i = i + 1) {
			countingArray[array[i] - minValue]++;
		}
		
		// output
		int offset = 0;
		for (int i = 0; i < countingArrayLength; i = i + 1) {
			for (int j = 0; j < countingArray[i]; j = j + 1) {
				array[j + offset] = i + minValue;
			}
			offset = offset + countingArray[i];
		}
	}
	
	public void radixSort() {
		// assumption: array items are integers with large range but of few digits
		// this method does not apply to arrays with negative numbers
		// but one can divide an array into two arrays (one contains positive numbers, the other have the negative ones), and sort them separately
		int[] array = this.arrayCopy;
		
		// find the max of the array
		int maxValue = array[0];
		for (int i = 1; i < array.length; i = i + 1) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		
		// find the max length of digits
		int maxDigits = 1;
		while (maxValue / 10 != 0) {
			maxValue = maxValue / 10;
			maxDigits = maxDigits + 1;
		}
		
		// gather elements with the same digit and put them back to the array from 0 to 9
		int div = 1;
		int digit, counter;
		final int queueLen = 10;
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] queue = new ArrayList[queueLen]; // digits from 0 to 9
		for (int i = 0; i < queueLen; i++) {
			queue[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < maxDigits; i = i + 1) {
			for (int j = 0; j < queueLen; j++) {
				queue[j].clear();
			}
			
			for (int j = 0; j < array.length; j = j + 1) {
				digit = array[j] / div % 10;
				queue[digit].add(array[j]);
			}
			
			counter = 0;
			for (int j = 0; j < queueLen; j = j + 1) {
				for (int k = 0; k < queue[j].size(); k = k + 1) {
					array[counter] = queue[j].get(k);
					counter = counter + 1;
				}
			}
			
			div = div * 10;
		}
	}
	
	private void heapify(int[] array, int n, int i) {
		// If the index of any element in the array is i, 
		// the element in the index 2i+1 will become the left child and element in 2i+2 index will become the right child. 
		// Also, the parent of any element at index i is given by the lower bound of (i-1)/2.
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		
		if ( (left < n) && (array[left] > array[largest]) ) {
			largest = left;
		}
		if ( (right < n) && (array[right] > array[largest]) ) {
			largest = right;
		}
		
		if (largest != i) {
			swap(array, largest, i);
			heapify(array, n, largest);
		}
	}
	
	public void heapSort() {
		int[] array = this.arrayCopy;
		int n = array.length;
		
		// build max-heap: In the case of a complete tree, the first index of a non-leaf node is given by n/2 - 1. 
		// All other nodes after that are leaf-nodes and thus don't need to be heapified.
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(array, n, i);
		}
		
		// sort
		while (n > 1) {
			swap(array, n - 1, 0);
			n--;
			heapify(array, n, 0);
		}
	}
	
	public ArrayList<Integer> generateArrayCopyList() {
		ArrayList<Integer> arrayCopyList = new ArrayList<Integer>();
		for (int i = 0; i < this.length; i++) {
			arrayCopyList.add(this.arrayCopy[i]);
		}
		return arrayCopyList;
	}
	
	public void refreshArrayCopyByArrayList(ArrayList<Integer> arrayCopyList) {
		for (int i = 0; i < this.length; i++) {
			this.arrayCopy[i] = arrayCopyList.get(i);
		}
	}
	
	public void bucketSort(ArrayList<Integer> arrayList, int numOfBuckets) {
		// Several buckets are created. Each bucket is filled with a specific range of elements. 
		// The elements inside the bucket are sorted using any other algorithm. 
		// Finally, the elements of the bucket are gathered to get the sorted array.
		if (arrayList.size() < 2) {
			return;
		}
		
		// find the max and the min of the array to be sorted
		int minValue = arrayList.get(0);
		int maxValue = arrayList.get(0);
		for (int i = 1; i < arrayList.size(); i++) {
			if (arrayList.get(i) < minValue) {
				minValue = arrayList.get(i);
			}
			if (arrayList.get(i) > maxValue) {
				maxValue = arrayList.get(i);
			}
		}
		
		// if all the elements of a bucket are the same, there's no need to sort them 
		if (minValue == maxValue) {
			return;
		}
		
		// create a 2-D ArrayList
		ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>(numOfBuckets);
		for (int i = 0; i < numOfBuckets; i++) {
			buckets.add(new ArrayList<Integer>());
		}
		
		// put data into buckets
		int index;
		int bucketRange = (maxValue - minValue) / numOfBuckets + 1;
		for (int i = 0; i < arrayList.size(); i++) {
			index = (arrayList.get(i) - minValue) / bucketRange;
			buckets.get(index).add(arrayList.get(i));
		}
		
		// sort data in each buckets
		for (int i = 0; i < numOfBuckets; i++) {
			bucketSort(buckets.get(i), numOfBuckets);
		}
		
		// get the sorted array
		int counter = 0;
		for (int i = 0; i < numOfBuckets; i++) {
			for (int j = 0; j < buckets.get(i).size(); j++) {
				arrayList.set(counter, buckets.get(i).get(j));
				counter++;
			}
		}
	}
}