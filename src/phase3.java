import java.util.*;


public class phase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter=1;		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdueix una paraula: ");
		
		String word = sc.nextLine();
		
		sc.close();
		
		Map<String, Integer>wordChar = new TreeMap<String, Integer>();
		
		for (int i=0; i<word.length(); i++) {
												
			if (wordChar.containsKey(Character.toString(word.charAt(i))) == true) {
				
				counter = wordChar.get(Character.toString(word.charAt(i))) + 1;
				
				wordChar.replace(Character.toString(word.charAt(i)), counter);
				
			} else {
			
			wordChar.put(Character.toString(word.charAt(i)), counter);
			
			}
			
			counter=1;
				
		}
		
		System.out.println(wordChar);

	}

}
