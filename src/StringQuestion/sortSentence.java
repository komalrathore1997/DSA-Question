package StringQuestion;

public class sortSentence {
    public static void main(String[] args) {
    	 String s="is2 sentence4 This1 a3";
    	 String[] s1=s.split(" ");
         String[] ans=new String[s1.length];
         StringBuilder sb=new StringBuilder();
         for(int i=0;i<s1.length;i++){
             int k= s1[i].length()-1;
             int m=s1[i].charAt(k);
             ans[m-1]=s1[i].substring(0,k);
         }
         for(int j=0;j<ans.length;j++){
             sb.append(ans[j]+" ");
         }

         System.out.println((sb.toString()).trim());
     
	}
}
