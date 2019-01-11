package maari.mahmoud.vendingmachine;

import java.util.Scanner;

import maari.mahmoud.vendingmachine.models.*;

/**
 * Hello world!
 *
 */
public class App

{
	public static final Scanner in = new Scanner(System.in);
	public static final Scanner ins = new Scanner(System.in);
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true, no = false, again = true, moneyinput = false;
		int[] m = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000 };
		int[] chang = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000 };
		int[] denominations = new int[0];
		int amount = 0, foodprice = 59, snaksprice = 25, drinkprice = 10;

		MoneyChang moneychang = new ProductAndChang();
		MoneyChang buyfood = new Food();
		MoneyChang buysnaks = new Snaks();
		MoneyChang buydrink = new Drink();
		System.out.println("========== menu ========== ");
		System.out.println("food price is 59kr:- \n" + "snaks price is 25kr:- \n" + "drink price is 10kr:-");
		System.out.println("*********************");
		int input = 0;
		while (again) {
			do {
				System.out.println("but money");
				input = in.nextInt();
				moneyinput = true;
				if (input == 1 || input == 2 || input == 5 || input == 10 || input == 20 || input == 50 || input == 100
						|| input == 200 || input == 500 || input == 1000) {
				} else {
					System.out.println("not valid money");
				}
			} while (!moneyinput);
			amount += input;
			System.out.println("Your money now is : " + amount + "kr");
			System.out.println("press y to put more money or n to start buying");
			String more = ins.nextLine();
			run = BuyAgain.moremoney(more);

			if (amount < drinkprice) {
				run = false;
				no = false;
			}
			while (run) {
				for (int i = 0; i < denominations.length; i++) {
					denominations[i] = amount;
				}
				do {
					System.out.println(" press (1) for food = " + foodprice + " kr:-" + "\n press (2) for snaks = "
							+ snaksprice + "kr:-" + "\n press (3) for drink = " + drinkprice + "kr:-"
							+ "\n press (4) to leave");
					String op = s.nextLine();
					switch (op) {
					case "1":
						if (amount < foodprice) {

							System.out.println("not enough money" + "\nput more money plase");
							input = in.nextInt();
							amount += input;
							System.out.println("Your money : " + amount + "kr:-");

						}
						if (amount >= foodprice) {

							amount = buyfood.buy(amount, foodprice);
							System.out.println("your money : " + amount + "kr:-" + "\nyour food is ready  to eat");
							no = true;
						}
						run = false;
						break;
					case "2":
						if (amount < snaksprice) {
							System.out.println("not enough money" + "\nput more money plase");
							input = in.nextInt();
							amount += input;
							System.out.println(amount);

						}
						if (amount >= snaksprice) {
							amount = buysnaks.buy(amount, snaksprice);
							System.out.println("your money : " + amount + "kr:-" + "\nyour snake is ready to eat");
							no = true;
						}
						run = false;
						break;
					case "3":
						if (amount < drinkprice) {
							System.out.println("not enough money" + "\nput more money plase");
							input = in.nextInt();
							amount += input;
							System.out.println(amount);

						}
						if (amount >= drinkprice) {
							amount = buydrink.buy(amount, drinkprice);
							System.out.println("your money : " + amount + "kr:-" + "\nyour drik is ready to drink");
							no = true;
						}
						run = false;
						break;
					case "4":
						run = false;
						no = true;
						moneyinput = false;
						again = false;
						break;
					default:
						System.out.println("not valid number");
						no = true;
					}

				} while (!no);

				System.out.println("press (y) if you want to bay more or " + "press (n) to stop and get yuor chang");
				String answer = s.nextLine();
				run = BuyAgain.buyagain(answer);
				again = false;
				if (run == false) {
					System.out.println("return money : " + amount + "kr:-");
					amount = moneychang.money(chang, amount);
					for (int i = 0; i < chang.length; i++) {
						if (chang[i] != 0) {
							System.out.println("your chang : " + chang[i] + "st" + " x " + m[i] + " kr:-");
						}
					}
				}
			}
		}
	}
}
