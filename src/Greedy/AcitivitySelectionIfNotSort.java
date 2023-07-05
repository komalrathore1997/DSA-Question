package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AcitivitySelectionIfNotSort {
	public static void main(String[] args) {
		int []start= {1,3,2,5};
		int []end= {2,4,3,6};
		
		
//		Sorting End
		
		int activities[][]=new int[start.length][3];
		for(int i=0;i<start.length;i++) {
			activities[i][0]=i;
			activities[i][1]=start[i];
			activities[i][2]=end[i];
			
		}
		
		Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
		
//		end time basic sorted
		
		int maxAct=0;
	
//		To store activity index 
		
		ArrayList<Integer> ans=new ArrayList<>();
		
		maxAct=1;
		ans.add(activities[0][0]);
		int lastEnd=activities[0][2];
		
		for(int i=1;i<end.length;i++) {
			if(activities[i][1]>=lastEnd) {
				maxAct++;
				ans.add(activities[i][0]);
				lastEnd=activities[i][2];
			}
		}
		
		System.out.println("Max actitvity :"+ maxAct);
		
		for(int i=0;i<ans.size();i++) {
			System.out.println("A"+ans.get(i)+" ");
		}
		
	}
}
