package Greedy;

import java.util.ArrayList;

/*Given N activities with their start and finish day given in array start[ ] and end[ ]. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a given day.
Note : Duration of the activity includes both starting and ending day.*/

public class AcitivitySelection {
    public static void main(String[] args) {
		int []start= {1,3,0,5,8,5};
		int []end= {2,4,6,7,9,9};
		
		
//		Sorting End
		
		
//		end time basic sorted
		
		int maxAct=0;
	
//		To store activity index 
		
		ArrayList<Integer> ans=new ArrayList<>();
		
		maxAct=1;
		ans.add(0);
		int lastEnd=end[0];
		
		for(int i=1;i<end.length;i++) {
			if(start[i]>=lastEnd) {
				maxAct++;
				ans.add(i);
				lastEnd=end[i];
			}
		}
		
		System.out.println("Max actitvity"+ maxAct);
		
		for(int i=0;i<ans.size();i++) {
			System.out.println("A"+ans.get(i)+" ");
		}
		
	}
}

//  Time compelxity o(n)
