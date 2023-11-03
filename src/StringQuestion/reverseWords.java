package StringQuestion;

public class reverseWords {
   public static void main(String[] args) {
	   String S="i.like.this.program.very.much";
	   String arr[]=S.split(" ");
       int n=arr.length;
       StringBuilder sb=new StringBuilder();
       for(int i=n;i>0;i--){
           sb.append(arr[i]);
       }
       
       System.out.println(sb.toString());
}
}
