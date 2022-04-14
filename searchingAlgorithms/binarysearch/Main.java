package searchingAlgorithms.binarysearch;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends BinarySearch {
	public static void main(String [] args) {
		ArrayList<Integer> arr = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements into array list");
		for (int i = 0; i<10;i++) {
			arr.add(sc.nextInt());
		}
		System.out.println("Enter the target element");
		int t = sc.nextInt();	
		BinarySearch bs = new BinarySearch();
		int a = bs.BSearch(arr, t);
		System.out.println(a);
	}
}
