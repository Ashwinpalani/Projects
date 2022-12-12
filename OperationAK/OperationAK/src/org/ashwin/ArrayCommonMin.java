package org.ashwin;

import java.util.Arrays;

public class ArrayCommonMin {
	public static void main(String[] args) {
		int a[]= {12,34,21,2,10,4};
		 int b[]= {3,4,12,21,34,8};
		 int c[]= {12,3,4,23,10,8};
		 Arrays.sort(a);
		 Arrays.sort(b);
		 Arrays.sort(c);
		 for (int i = 0; i < a.length; i++) {
			if (common(a[i],b)) {
				if (common(a[i],c)) {
					System.out.println(a[i]);
					break;
				}
			}
		}
	}

	static boolean common(int i, int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			if (i==arr[j]) {
				return true;
			}
			else if (i<arr[j]) {
				return false;
			}
		}
		return false;
		
		
	}
	 
	

}
