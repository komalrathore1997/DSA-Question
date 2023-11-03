package StringQuestion;

class kGrammar {
	public static void main(String[] args) {
		int n = 2;
		int k = 1;
		String str = "0";
		kthGrammar(n, 1, str);
		System.out.println(str.charAt(k));
	}

	private static void kthGrammar(int n, int start, String str) {
		if (n == start) {
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				str += "01";
			} else if (str.charAt(i) == 1) {
				str += "10";
			}
		}
		kthGrammar(n, start + 1, str);
	}

}