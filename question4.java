package Assessment1;

import java.util.Scanner;

public class question4 {
	public static void main(String args[]) {
		//write a program find the smallest number amoung three
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the number for A");
		int a= input.nextInt();
		System.out.println("Enter the number for B");
		int b= input.nextInt();
		System.out.println("Enter the number for C");
		int c= input.nextInt();
		int smallestnumber;
		if (a<=b && a<=c) {
            smallestnumber = a;
        } else if (b<=a && b<=c) {
            smallestnumber = b;
        } else {
            smallestnumber = c;
        }
		System.out.println("Smallest number is " + smallestnumber);
		
	}

}
