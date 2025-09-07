package basics;

import java.util.HashMap;

public class HashMap_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="java is fun and java is powerful";
		HashMap<String,Integer> freq=new HashMap<String,Integer>();
		 for (String word : input.split(" ")) {
	            freq.put(word, freq.getOrDefault(word ,0)+1);
	        }
		 System.out.println(freq);
	}

}
