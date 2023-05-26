package StringQuestion;

public class ReverseWord {
    public static void main(String[] args) {
		String s="the sky is blue";
		if(s==null || s.length()==0){
			System.out.println("");
        }
        String[] s1=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=s1.length-1;i>=0;--i){
            if(!s1[i].equals("")){
                sb.append(s1[i]).append("");
            }
        }
		
		System.out.println(sb.length()==0?" ":sb.substring(0,sb.length()-1));
	}
    
}
