package sudipmitra.reversearray;

import java.util.Scanner;

public class ReverseArray {
	static int arr[] = new int[6];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter Six integers to add in array:");
		putelementsinArray();
		System.out.println("Elements before reversal: ");
		printArray();
		int temp;
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println("After reversal: ");
		printArray();
	}

	private static void putelementsinArray() {
		for (int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
	}

	private static void printArray() {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
