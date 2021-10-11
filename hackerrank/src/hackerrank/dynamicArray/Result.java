package hackerrank.dynamicArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Result {
	/*
	 * https://www.hackerrank.com/challenges/dynamic-array/problem?h_r=next-
	 * challenge&h_v=zen Complete the 'dynamicArray' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER n 2. 2D_INTEGER_ARRAY queries
	 */

	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		int lastAnswer = 0;
		List<Integer> lstAnswer = new ArrayList<Integer>();
		List<List<Integer>> lstInt = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			lstInt.add(new ArrayList<Integer>());
		}

		for (List<Integer> query : queries) {
			int idx = (query.get(1) ^ lastAnswer) % n;

			int x = query.get(0);
			int y = query.get(2);
			if (x == 1) {
				lstInt.get(idx).add(y);
			} else if (x == 2) {
				int innerIdx = y % lstInt.get(idx).size();
				lastAnswer = lstInt.get(idx).get(innerIdx);
				lstAnswer.add(lastAnswer);
			}
		}

		return lstAnswer;
	}
}
