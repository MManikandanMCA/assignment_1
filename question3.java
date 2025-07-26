package Assessment1;
import java.util.Scanner;
public class question3 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the number to be reversed
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int reversed = 0;

	        // Loop to reverse the digits
	        while (number != 0) {
	            int digit = number % 10;    
	            System.out.println(digit);
	            reversed = reversed * 10 + digit;  
	            System.out.println(reversed);
	            number /= 10;  
	            System.out.println(number);
	        }

	        System.out.println(reversed);

	}


}
