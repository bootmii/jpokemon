package pok�mon;
import java.util.Scanner;
public class Pok�monGame {
	public static Scanner input = new Scanner(System.in);
	public static void battleStart() {
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Zebstrika appeared.");
		System.out.println("Which Pok�mon do you choose?");
		String yourChoice = input.next(); // get next string
		System.out.println("You chose "+yourChoice+'!');
		System.out.println("It's a Pok�mon battle between "+yourChoice
				+" and Zebstrika! Go!");
	}
}
