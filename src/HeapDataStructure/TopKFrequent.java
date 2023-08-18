package HeapDataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TopKFrequent {
	
	public static void main(String[] args) {
		TopKFrequent obj=new TopKFrequent();
		int nums[]= {1,1,1,2,2,3};
		int k=2;
		int[] topKFrequent = obj.topKFrequent(nums, k);
		for(int x:topKFrequent) {
			System.out.println(x);
		}
	}

	public int[] topKFrequent(int[] nums, int k) {
		int ans[] = new int[k];
		Map<Integer, Integer> map = new TreeMap<>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
		Collections.sort(entryList, (a, b) -> b.getValue() - a.getValue());

		for (int i = 0; i < k; i++) {
			ans[i] = entryList.get(i).getKey();
		}
		return ans;
	}
}
