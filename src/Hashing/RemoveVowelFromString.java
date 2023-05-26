package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveVowelFromString {
	public static void main(String[] args) {
		RemoveVowelFromString k=new RemoveVowelFromString();
		String str = "what is your name";
		String removeVowelFromString = k.removeVowelFromString(str);
		System.out.println(removeVowelFromString);
		int arr[]= {10, 5, 3, 4, 3, 5, 6};

	}
	
	public String removeVowelFromString(String str) {
		Set<Character> vowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		StringBuilder sb = new StringBuilder();
		char[] charArray = str.toCharArray();
		for (Character ch : charArray) {
			if (!vowels.contains(ch)) {
				sb.append(ch);
			}
		}
		return sb.toString();

	}
	
	public int firstNonRepeatingChar(String str) {
		Map<Character,Integer> cfm=new HashMap<>();
		char[] chars=str.toCharArray();
		for(char ch:chars) {
			cfm.put(ch, cfm.getOrDefault(chars, 0)+1);
		}
		for(int i=0;i<chars.length;i++) {
			char ch=chars[i];
			if(cfm.get(ch)==1) {
				return i;
			}
		}
		return -1;
		
	}
	
	
}
