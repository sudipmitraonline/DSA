import java.util.Scanner;

public class ContainsDuplicate_Bruteforce {
	static Scanner sc = new Scanner(System.in);
	static int arr[] = new int[7];

	private static void addElementsinArray() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	private static boolean containsDuplicateCheck() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					return true;
				}
			}
		}
		return false;
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
