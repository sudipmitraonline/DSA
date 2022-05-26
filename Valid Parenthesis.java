import java.util.Scanner;
import java.util.Stack;

public class valid_parenthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter parenthesis");
		String str = sc.nextLine();
		char s[] = str.toCharArray();
		if(parenthesischeck(s))
			System.out.println("Parenthesis order is valid");
		else
			System.out.println("Invalid");
		}
	
	private static boolean parenthesischeck(char[] s) {
		if (s.length%2!=0)
			return false;
		Stack<Character> stack = new Stack<>();
		for (char c : s) {
			if(c == '(' || c =='{' || c=='[') {
				stack.push(c);
			}
			else if (c == ')' && !stack.isEmpty() && stack.peek()=='(') {
				stack.pop();
			}
			else if (c == '}' && !stack.isEmpty() && stack.peek()=='{') {
				stack.pop();
			}
			else if (c == ']' && !stack.isEmpty() && stack.peek()=='[') {
				stack.pop();
			}
			else
				return false;
		}
		return stack.isEmpty();
	}
}
