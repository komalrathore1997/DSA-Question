package Arrays_Question;

public class RearranceArrayOOne {
   public static void main(String[] args) {
	   int []arr= {0,1};
	   int n=arr.length;
       int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=arr[arr[i]];
      }
      
         
      for(int i=0;i<n;i++){
          arr[i]=a[n];
      }
}
}
