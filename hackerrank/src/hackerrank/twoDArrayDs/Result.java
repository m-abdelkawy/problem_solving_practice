package hackerrank.twoDArrayDs;

import java.util.List;

public class Result {
	/*
	 * https://www.hackerrank.com/challenges/2d-array/problem
	 * Complete the 'hourglassSum' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * 2D_INTEGER_ARRAY arr as parameter.
	 * 
	 * -9 -9 -9 1 1 1 0 -9 0 4 3 2 -9 -9 -9 1 2 3 0 0 8 6 6 0 0 0 0 -2 0 0 0 0 1 2 4
	 * 0
	 */

	public static int hourglassSum(List<List<Integer>> arr) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < 16; i++) {
			int sum = 0;
			List<Integer> lst1 = null;
			List<Integer> lst2 = null;
			List<Integer> lst3 = null;
			if (i < 4) {
				lst1 = arr.get(0);
				lst2 = arr.get(1);
				lst3 = arr.get(2);
			} else if (i < 8) {
				lst1 = arr.get(1);
				lst2 = arr.get(2);
				lst3 = arr.get(3);
			} else if (i < 12) {
				lst1 = arr.get(2);
				lst2 = arr.get(3);
				lst3 = arr.get(4);
			} else {
				lst1 = arr.get(3);
				lst2 = arr.get(4);
				lst3 = arr.get(5);
			}

			int j = i % 4;
			sum += lst1.get(j);
			sum += lst1.get(j + 1);
			sum += lst1.get(j + 2);
			sum += lst2.get(j + 1);
			sum += lst3.get(j);
			sum += lst3.get(j + 1);
			sum += lst3.get(j + 2);

			maxSum = Math.max(maxSum, sum);
		}
		return maxSum;
	}
	
	public static int hourglassSum2(List<List<Integer>> arr) {
		int maxSum = Integer.MIN_VALUE;
		List<Integer> lst1 = null;
		List<Integer> lst2 = null;
		List<Integer> lst3 = null;
		for (int i = 0; i < 4; i++) {
			lst1 = arr.get(i);
			lst2 = arr.get(i + 1);
			lst3 = arr.get(i + 2);
			for (int j = 0; j < 4; j++) {
				int sum = 0;
				sum += lst1.get(j) + lst1.get(j+1) + lst1.get(j+2);
				sum += lst2.get(j+1);
				sum += lst3.get(j) + lst3.get(j+1) + lst3.get(j+2);
				maxSum = Math.max(maxSum, sum);
			}
		}
		return maxSum;
	}
}
