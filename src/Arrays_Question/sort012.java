package Arrays_Question;

public class sort012 {
   public static void main(String[] args) {
	   int a[]= {0, 2, 1, 2, 0};
	   int n=a.length;
	   int z=0;
       int o=0;
       int t=0;
       for(int i=0;i<n;i++){
           if(a[i]==0){
               z++;
           }else if(a[i]==1){
               o++;
           }else if(a[i]==2){
               t++;
           }
       }
       
       for(int j=0;j<z;j++){
           a[j]=0;
       }
       
       for(int j=z;j<o;j++){
           a[j]=1;
           
       }
       
       for(int j=o+z;j<n;j++){
           a[j]=2;
       }
       
       for(int i=0;i<n;i++) {
    	   System.out.print(a[i]+" ");
       }
}
}
