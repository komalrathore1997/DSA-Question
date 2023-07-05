package StringQuestion;

public class StringisPalindrome {
	public static void main(String[] args) {
	    String s="komal";
	    int i=0;
	    int n=s.length();
        boolean palindrome = palindrome(s,i,n);
        System.out.println(palindrome);
	}

	private static boolean palindrome(String s, int i, int n) {
		if(i>=n/2) return true;
		if(s.charAt(i)!=s.charAt(n-i-1)) return false;
		
		return palindrome(s, i+1, n);
		
	}
   
}
