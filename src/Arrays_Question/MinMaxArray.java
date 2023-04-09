package Arrays_Question;

public class MinMaxArray {
	public static void main(String[] args) {
		MinMaxArray mn=new MinMaxArray();
		int[] arr= {2,5,9,1,5};
		int minmethod = mn.minmethod(arr);
		System.out.println("Minimum value in array :"+minmethod);
	}

	private int minmethod(int[] arr) {
		int min=arr[0];
		 for(int i=0;i<arr.length-1;i++) {
			 for(int j=i+1; j<arr.length-1; j++) {
				 if(min<arr[j]) {
					 min=arr[j];
				 }
			 }
		 }
		 return min;
	}
}
