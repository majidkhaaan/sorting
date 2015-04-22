package org.sorting.practice;

public class ArraySortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSize = 100000; // array size
		MyIntArray arr; // reference to array
		arr = new MyIntArray(maxSize); // create the array
//		arr.insert(77); // insert 10 items
//		arr.insert(99);
//		arr.insert(44);
//		arr.insert(55);
//		arr.insert(22);
//		arr.insert(88);
//		arr.insert(11);
//		arr.insert(00);
//		arr.insert(66);
//		arr.insert(33);
//		arr.display(); // display items
//		arr.insertionSort(); // bubble sort them
//		arr.display(); // display items
	
		
		for(int i=0;i<maxSize;i++)
			arr.insert((int) (java.lang.Math.random()*1000) );
//			arr.insert(i);

//		arr.display();
//		arr.quickSort();
//		arr.display();
				
		System.out.println("start");
		long startTime = System.currentTimeMillis();
//		arr.bubbleSort();
//		arr.insertionSort();
//		arr.selectionSort();
		arr.quickSort();
		long stopTime = System.currentTimeMillis();
		System.out.println("stop");
		System.out.println("time elapsed:" + ((stopTime-startTime)/1000)+"s");
		
	}

}
