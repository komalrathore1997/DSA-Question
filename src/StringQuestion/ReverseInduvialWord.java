package StringQuestion;

public class ReverseInduvialWord {
    public static void main(String[] args) {
		String s="geeks quiz practice code";
		reverse(s);
	}

	private static void reverse(String s) {
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				s1=s1+s.substring(0,i);
			}
			for(int j=s1.length();j>=0;j--) {
				s1=s1+s1.charAt(i);
			}
		}
	}
}
