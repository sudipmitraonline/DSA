import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
    
		int max = 0, min = 0;
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		System.out.println("Enter Six nums to add in array:");
		for (int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		if (arr.length<2) {
			min = arr[0];
			max = arr[0];
		}
		else {
			if(arr[0]>arr[1]) {
				max = arr[0];
				min = arr[1];
			}
			if (arr[0]<arr[1]) {
				min = arr[0];
				max = arr[1];
			}
			for(int i = 2;i<arr.length;i++) {
				if(arr[i]>max) {
					max = arr[i];
				}
				if (arr[i]<min) {
					min = arr[i];
				}
			}
		}
		System.out.println("max value is: " + max +" and min value is: "+min);
	}

}
