import java.util.Scanner;

public class ValidAnagram_asci {
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
	
		if(s.length()!=t.length())
			return false;
		int countarr[] = new int[26];
		for(int i=0;i<s.length();i++) {
			countarr[s.charAt(i)-'a']++;
			countarr[t.charAt(i)-'a']--;
		}
		for (int j=0;j<countarr.length;j++) {
			if(countarr[j]!=0)
				return false;
		}
		return true;
	}
}
