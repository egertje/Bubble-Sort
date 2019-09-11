import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BubbleSort bubble = new BubbleSort();
        System.out.println("How many characters would you like in the array?");
        int n = in.nextInt();
        int ar[] = new int[n];
        System.out.println("Please enter all the characters in the array below: ");
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        System.out.println("Here is the array unsorted: ");
        bubble.printArray(ar);
        System.out.printf("%n");
        int sortedArray[] = bubble.bubbleSortAlgorithm(ar);
        System.out.println("Here is the sorted array: ");
        bubble.printArray(sortedArray);  
	}
	
	public int[] bubbleSortAlgorithm(int[] array) {
		boolean traverseAgain = true;
        while (traverseAgain) {
        	traverseAgain = false;
        	for(int i = 1; i < array.length; i++) {
        		int temp;
        		if (array[i-1] > array[i]) {
        			temp = array[i-1];
        			array[i-1] = array[i];
        			array[i] = temp;
        			traverseAgain = true;
        		}
        	}
        }
        return array;
	}
	
	public void printArray(int[] array) {
		for(int i=0; i < array.length; i++) {
	        System.out.print(array[i] + " ");
		}
	}
}
