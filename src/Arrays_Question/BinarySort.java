package Arrays_Question;

public class BinarySort {
	public static void main(String[] args) {
		int A[] = {0,1,0,1,0,0,1};
		int[] check = check(A, A.length);
		for(int x:check) {
			System.out.println(x);
		}
	}
	
	private static int[] check(int[] A, int N) {
		   int temp[]=new int[N];
	        int j=0;
	      for(int i=0;i<N;i++){
	          if(A[i]==0){
	              temp[j++]=A[i];
	          }
	      }
	       for(int i=0;i<N;i++){
	          if(A[i]==1){
	              temp[j++]=A[i];
	          }
	      }
	      for(int i=0;i<N;i++){
	          A[i]=temp[i];
	      }
	      return A;
	}
}
