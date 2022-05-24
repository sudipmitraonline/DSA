import java.util.Scanner;

public class Valid_Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line of Strings");
		String str = sc.nextLine();
		char s[] = str.toCharArray();
		String updatedstr = "";
		for (char c : s) {
			if (Character.isDigit(c) || Character.isLetter(c))
				updatedstr += c;
		}
		String updatedstrlower = updatedstr.toLowerCase();
		if (palindromecheck(updatedstrlower))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
	}

	private static boolean palindromecheck(String str) {
		int leftpointer = 0;
		int rightpointer = str.length() - 1;

		while (leftpointer < rightpointer) {
			if (str.charAt(leftpointer) != str.charAt(rightpointer))
				return false;

			leftpointer++;
			rightpointer--;
		}
		return true;
	}
}
