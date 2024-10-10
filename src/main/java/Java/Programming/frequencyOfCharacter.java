package Java.Programming;

import java.util.HashMap;

public class frequencyOfCharacter {

	
	static void countOfCharacter(String input) {
		
		HashMap<Character,Integer> countOfChar= new HashMap<Character,Integer> ();
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(countOfChar.containsKey(ch)) {
				countOfChar.put(ch, countOfChar.get(ch)+1);
			}else {
				countOfChar.put(ch, 1);
			}
			
		}
		System.out.println(countOfChar);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countOfCharacter("Dnyaneshwari");
	}

}
