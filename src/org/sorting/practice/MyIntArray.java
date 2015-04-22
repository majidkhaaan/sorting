package org.sorting.practice;

public class MyIntArray {
	private int[] myArray;
	private int numElements;

	public MyIntArray(int max) {
		myArray = new int[max];
		numElements = 0;
	}

	public void insert(int value) {
		myArray[numElements] = value;
		numElements++;
	}

	public void display() {
		System.out.println("Displaying array");
		for (int j = 0; j < numElements; j++)
			System.out.print(" " + myArray[j]);
		System.out.println();
	}

	public void bubbleSort() {
		for (int i = numElements - 1; i > 1; i--)
			for (int j = 0; j < i; j++)
				if (myArray[j] > myArray[j + 1])
					swap(j, j + 1);
	}

	public void selectionSort() {
		int min;
		for (int i = 0; i < numElements - 1; i++) {
			min = i;
			for (int j = i + 1; j < numElements; j++)
				if (myArray[j] < myArray[min])
					min = j;
			swap(i, min);
		}
	}

	public void insertionSort() {
		for (int i = 1; i < numElements; i++) {
			int tmp = myArray[i];
			int j = i;
			while (j > 0 && myArray[j - 1] > tmp) {
				myArray[j] = myArray[j - 1];
				--j;
			}
			myArray[j] = tmp;
		}
	}

	private int partition(int left, int right, int pivot) {
		int leftPtr = left - 1;
		int rightPtr = right;
		while (true) {
			while (myArray[++leftPtr]<pivot);
			while (rightPtr>0 && myArray[--rightPtr]>pivot);
			if (leftPtr >= rightPtr)
				break;
			else
				swap(leftPtr, rightPtr);
		}
		swap(leftPtr,right);
		return leftPtr;
	}
	private void recQuickSort(int left, int right) {
		if(left>=right)
			return;
		else {
			int pivot = myArray[right];
			int partitionVal = partition(left,right,pivot);
			recQuickSort(left,partitionVal-1);
			recQuickSort(partitionVal+1,right);
			
		}
	}
	public void quickSort () {
		recQuickSort(0,numElements-1);
	}

	public void swap(int i, int j) {
		int tmp;
		tmp = myArray[i];
		myArray[i] = myArray[j];
		myArray[j] = tmp;
	}

}
