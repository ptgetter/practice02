package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액: ");
		int price = scan.nextInt();
		scan.close();
		
		int division = 0;
		int lastMod = price;		
		for(int money : MONEYS) {
			division = (lastMod - (lastMod % money)) / money;
			lastMod = lastMod % money;
			
			System.out.printf("%d원 : %d개\n", money, division);			
		}
		
 	}
}