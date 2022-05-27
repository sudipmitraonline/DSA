import java.util.ArrayList;
import java.util.Scanner;

public class RemoveConsecutiveCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> arlist = new ArrayList<Character>();
		String str = sc.next();
		String yy = "";
		char[] s = str.toCharArray();
		for (int i = 0; i < s.length; i++) {

			if (i < s.length - 1 && s[i] == s[i + 1]) {
				continue;

			} else {
				arlist.add(s[i]);
			}
		}
		for (char c : arlist) {
			yy += c;
		}
		System.out.println(yy);
	}
}
