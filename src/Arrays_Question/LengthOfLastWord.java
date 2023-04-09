package Arrays_Question;

public class LengthOfLastWord {
   public static void main(String[] args) {
	   String s="   fly me   to   the moon  ";
	   int i;
       String s1=s.trim();
       for(i=s1.length()-1;i>=0;i--){
           if(s1.charAt(i)==' ')
           System.out.println(i);
       }
       System.out.println(i);
}
}
