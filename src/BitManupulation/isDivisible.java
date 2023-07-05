package BitManupulation;

public class isDivisible {
    public static void main(String[] args) {
    	 String s="111";
    	 int k=0;
         int sum=0;
         for(int i=s.length()-1;i>=0;i--){
             if(s.charAt(i)=='1'){
                 sum+=Math.pow(2,k);
             }else{
                 sum+=0;
             }
             k++;
         }
         if(sum%3==0){
             System.out.println(1);
         }else {
        	 
        	 System.out.println(0);
         }
	}
}
