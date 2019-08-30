
import java.util.Scanner;

public class Welcome {
	
	public static void main (String[]  args ) {
		
		
		String welcome = "welcome to Java world";
		
		System.out.print(welcome);
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("I am a program, what is your name?");
	
		String name = input.nextLine();
		
		System.out.println("Nice to meet you, "+name+"");
	
	}

}
