package StringQuestion;

public class LastIndex {
	public static void main(String[] args) {
		String s = "00001";
		int lastindex = lastindex(s);
		System.out.println(lastindex);

	}

	private static int lastindex(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '1') {
				return i;
			}
		}
		return -1;
	}
}
