package StringQuestion;

public class NonrepeatingCharacter {
   public static void main(String[] args) {
	   String S="zxvczbtxyzvy";
       for(int i=0;i<S.length();i++){
           Character ch=S.charAt(i);
           for(int j=i+1;j<S.length();j++){
               if(!ch.equals(S.charAt(j))){
                   System.out.println( S.charAt(i));
               }else{
                   continue;
               }
           }
       }
       System.out.println(  '$');
}
}
