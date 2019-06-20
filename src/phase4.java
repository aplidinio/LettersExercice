import java.util.ArrayList;
import java.util.Scanner;

public class phase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Character> firstName = new ArrayList<Character>();
		
		ArrayList <Character> lastName = new ArrayList <Character>();
		
		ArrayList <Character> fullName = new ArrayList <Character>();
		
		String fiName, laName;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdueix el teu nom: ");
		
		fiName = sc.nextLine();
		
		System.out.println("Introdueix el teu cognom: ");
		
		laName = sc.nextLine();
		
		sc.close();
		
		for (int i=0; i<fiName.length(); i++) {
			
			firstName.add(fiName.charAt(i));
		}
		
		firstName.add(' ');
		
		for (int i=0; i<laName.length(); i++) {
			
			lastName.add(laName.charAt(i));
		}
				
		fullName.addAll(firstName);
		
		fullName.addAll(lastName);
		
		System.out.println(fullName);

	}

}
