import java.util.Scanner;

public class Remembering {

	public static void main(String[] args) {
		
		int num = 0;
		String thing = "1, ";
		Scanner theKeys = new Scanner(System.in);
		
		while (true) {
		
		System.out.println("Enter an integer: ");
		num = theKeys.nextInt();
		
		System.out.println("The number you entered was " + num + ".");
		System.out.print("Its factors are: ");
		
		for (int x = 1; x <= num; x++) {
			
			if(num % x == 0) {
				thing = x + ", ";
			} else {
				thing = "";
			}
			System.out.print(thing);
		}
		System.out.println();
		}


	}

}
