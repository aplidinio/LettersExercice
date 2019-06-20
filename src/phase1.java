import java.util.Scanner;

public class phase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Entra tu nombre: ");
			
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();
		
		char [] letters = new char [name.length()];
		
		sc.close();
		
		for (int i=0; i<name.length(); i++) {
			
			letters[i] = name.charAt(i);
			
		}
		
		for (char giveName: letters) {
			
			System.out.print(giveName + " ");
		}
		
	}

}
