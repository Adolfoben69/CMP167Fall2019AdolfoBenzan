/***
 * 
 * @author Adolfo
 *
 */
import java.util.Scanner;
public class Sum2 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("welcome, this program/ngenerates"
					+ " product of three numbers");
			System.out.println("enter three numbers");
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			int num3 = input.nextInt();
			int num4 = input.nextInt();
			int num5 = input.nextInt();
			
			int result = num1*num2*num3;
			System.out.println("result is " *+result);
		}
}