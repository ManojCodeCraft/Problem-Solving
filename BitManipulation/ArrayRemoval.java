package BitManipulation;

import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayRemoval {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int first = 0;
			int next = 0;
			for (int i = 0; i < n; i++) {
				next = next | arr[i];
				if ((next & next + 1) == 0)
					first = i + 1;
			}
			if (first == 0) {
				System.out.println(n);
			} else {
				System.out.println(n - first);
			}

		}

	}
}
