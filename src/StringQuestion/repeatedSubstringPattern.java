package StringQuestion;

import java.util.HashMap;
import java.util.Map;

public class repeatedSubstringPattern {
	
	public static void main(String[] args) {
	String s = "abab";
	
	Map<Character,Integer> map=new HashMap<>();
    for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    }
    for(Map.Entry<Character,Integer>  x:map.entrySet()){
        if(!map.containsValue(x.getValue())){
            System.out.println(false);
        }
        
    }
    System.out.println(true);
	}
}
