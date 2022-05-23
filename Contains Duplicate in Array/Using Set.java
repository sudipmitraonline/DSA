import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate_Hashset {
	static Scanner sc = new Scanner(System.in);
	static int arr[] = new int[7];

	private static void addElementsinArray() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	private static boolean containsDuplicateCheck() {
		Set<Integer> set = new HashSet<>();
		for (Integer element : arr) {
			set.add(element);
		}
		if (arr.length == set.size())
			return false;
		else
			return true;

	}

	public static void main(String[] args) {
		System.out.println("Enter seven digits to check: ");
		addElementsinArray();
		if (containsDuplicateCheck())
			System.out.println("Contains Duplicates");
		else
			System.out.println("No Duplicates");
	}

}
