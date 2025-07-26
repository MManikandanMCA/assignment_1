package Assessment1;

import java.util.Scanner;

public class questions5 {
	public static void main(String args[]) {
		//discount program
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		int amount=input.nextInt();
		if (amount<500) {
			System.out.println("no discount is applied");
		}else if(amount>500 && amount<1000) {
			System.out.println("10% discount is applied");
		}else {
			System.out.println("20% discount is applied");
		}
	}

}
