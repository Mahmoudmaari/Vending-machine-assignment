package maari.mahmoud.vendingmachine;

import java.util.Scanner;

public class MoneyInput {
	public static final Scanner in = new Scanner(System.in);
	public static final Scanner ins = new Scanner(System.in);
	public int input(int input, int amount) {
		boolean moneyinput = false,run = true; 
		while(run) {
		do {
			System.out.println("but money");
			input = in.nextInt();
			
			if (input == 1 || input == 2 || input == 5 || input == 10 || input == 20 || input == 50 || input == 100
					|| input == 200 || input == 500 || input == 1000) {
				amount += input;
				moneyinput = true;
			} else {
				System.out.println("not valid money");
			}
		} while (!moneyinput);
		
		System.out.println("Your money now is : " + amount + "kr");
		System.out.println("press y to put more money or n to start buying");
		String more = ins.nextLine();
		 run = BuyAgain.moremoney(more);
		
	}
		return amount;
	}
}
