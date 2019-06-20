import java.util.ArrayList;
import java.util.Scanner;

public class phase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Character> letters = new ArrayList<Character>();
		
		ArrayList<Character> vowels = new ArrayList<Character>();
				
		vowels.add('a');
		vowels.add('i');
		vowels.add('u');
		vowels.add('e');
		vowels.add('o');
													
		boolean evaluator;
		
		String name = null;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			evaluator = true;
			
			System.out.println("Entra el teu nom sense accents: ");
			
			name = sc.nextLine();
			
			for (int i=0; i<name.length(); i++) {
				
				if (Character.isDigit(name.charAt(i))== true 
						
						|| Character.isLetter(name.charAt(i)) == false) {
					
					System.out.println ("Els noms no contenen números ni caracters estranys!");
					
					evaluator = false;
					
				}
				
			} 
			
		} while (evaluator == false);
		
		sc.close();				
						
		for (int i=0; i<name.length(); i++) {
			
			letters.add(Character.toLowerCase(name.charAt(i)));
			
			if (vowels.contains(letters.get(i))) {
				
				System.out.println(name.charAt(i) + " és una VOCAL");
				
			} else {
				
				System.out.println(name.charAt(i) + " és una CONSONANT");
			}
		}

	}

}
