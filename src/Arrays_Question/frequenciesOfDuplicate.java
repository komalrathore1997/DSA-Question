package Arrays_Question;

import java.util.HashMap;
import java.util.Map.Entry;

public class frequenciesOfDuplicate {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 4, 6, 4, 7, 4, 5, 6, 6 };
		int n = arr.length;
		frequenciesOfDuplicate f = new frequenciesOfDuplicate();
		HashMap<Integer, Integer> frequency = f.frequencies(arr, n);
		System.out.println("Below is the frequency" + "of repeated elements -");
		for (Entry<Integer, Integer> entry : frequency.entrySet())
			if (entry.getValue() > 1)
				System.out.println(entry.getKey() + " --> " + entry.getValue());
	}


	private HashMap<Integer, Integer> frequencies(int[] arr, int n) {
		HashMap<Integer, Integer> hash = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (hash.containsKey(arr[i])) {
				hash.put(arr[i], hash.get(arr[i]) + 1);
			} else {
				hash.put(arr[i], 1);
			}
		}
		return hash;

	}
}
