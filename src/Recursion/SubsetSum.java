package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum {
	

	public static void slove(List<Integer> arr, int N, int sum, ArrayList<Integer> list) {
		if (N == 0) {
			list.add(sum);
		}

		slove(arr, N - 1, sum + arr.get(N - 1), list);
		slove(arr, N - 1, sum+ arr.get(N-1), list);
	}
	
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(2, 3);
		int N=arr.size()-1;
		ArrayList<Integer> list = new ArrayList<>();

		int sum = 0;
		slove(arr, N, sum, list);
		System.out.println(list);
	}
}
