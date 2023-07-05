package Arrays_Question;

public class MinMaxArray {
	public static void main(String[] args) {
		MinMaxArray mn=new MinMaxArray();
		int[] A= {2 ,1, -4, 5, 3};
		int minmethod = mn.minmethod(A);
		System.out.println("Minimum value in array :"+minmethod);
	}

	private int minmethod(int[] A) {
		 int max=A[0];
	        int min=A[0];
	        for(int i=1;i<A.length;i++){
	            if(A[i]>=max){
	                max=A[i];
	            }else if(A[i]<=min){
	                min=A[i];
	            }
	        }
	        return max+min;
	}
}
