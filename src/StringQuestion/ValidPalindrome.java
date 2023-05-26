package StringQuestion;

public class ValidPalindrome {
    public static void main(String[] args) {
    	String s = "A man, a plan, a canal: Panama";
    	String s1=s.toLowerCase().replaceAll("[^a-zA-z]","");
        int start=0;
        int end=s1.length()-1;
        while(start>end){
             boolean flag=false;
              if(s1.charAt(start)==s1.charAt(end)){
                  flag=true;
                  start++;
                  end--;
              }
        }
        System.out.println(false);
	}
}
