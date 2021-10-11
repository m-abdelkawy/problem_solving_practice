package hackerrank.twoDArrayDs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

	static final String TestCase0 = "src\\hackerrank\\twoDArrayDs\\testcase0.txt";
	static final String TestCase1 = "src\\hackerrank\\twoDArrayDs\\testcase1.txt";
	static final String TestCase2 = "src\\hackerrank\\twoDArrayDs\\testcase2.txt";
	
	public static void main(String[] args) throws IOException {
		//BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(TestCase0)));
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		List<List<Integer>> arr = new ArrayList<List<Integer>>();

		IntStream.range(0, 6).forEach(i -> {
			try {
				arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(Collectors.toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int result = Result.hourglassSum(arr);
		System.out.println(result);

		//bufferedWriter.write(String.valueOf(result));
		//bufferedWriter.newLine();

		bufferedReader.close();
		//bufferedWriter.close();
	}

}
