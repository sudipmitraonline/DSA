package searchingAlgorithms.binarysearch;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
	
	public int BSearch(ArrayList<Integer> num,int target){
		int point, left = 0, right = num.size()-1;
		while (left<=right) {
			point = (left+right)/2;
			if (num.get(point) == target) {
				return point;
			}
			if (target < num.get(point)) {
				right = point + 1;
			}
			else{
				left = point - 1;
			}
		}
		return -1;
		
	}
}
