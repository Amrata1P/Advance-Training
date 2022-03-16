import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
        System.out.println("Enter a number: ");
        Scanner scan= new Scanner(System.in);
        n=scan.nextInt();

		System.out.println("Even Numbers from 1 to "+n+" are: ");

		for (int i = 1; i <= n; i++) {

		   //if number%2 == 0 it means its an even number

		   if (i % 2 == 0) {

		 System.out.println(i + " ");

		   }

		}

	}

}
