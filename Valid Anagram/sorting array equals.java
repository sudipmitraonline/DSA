import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings : ");
		String s = sc.next();
		String t = sc.next();
		if (anagramcheck(s, t))
			System.out.println("valid");
		else
			System.out.println("Not Valid");

	}

	private static boolean anagramcheck(String s, String t) {
	
		if (s.length() != t.length())
			return false;
		char arrS[] = s.toCharArray();
		char arrT[] = t.toCharArray();
		Arrays.sort(arrS);
		Arrays.sort(arrT);
		if(Arrays.equals(arrS, arrT))
			return true;
		return false;
	}

}
