public class practice {

	public static void main(String[] args) {
		int[] s = {3,1,2,10,1};
		for (int j : runningsums(s)) {
			System.out.println(j);
		}
	}

	private static int[] runningsums(int[] s) {
		int store = 0;
		int[] newarr = new int[s.length];
		for(int i=0;i<s.length;i++) {
			if(i==0) {
				store = s[i];
				newarr[i] = s[i];
			}
			else {
				store = store + s[i];
				newarr[i] = store;
			}
		}
		return newarr;
	}
}
