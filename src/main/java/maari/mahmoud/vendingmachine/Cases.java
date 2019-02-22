package maari.mahmoud.vendingmachine;

import java.util.Scanner;

import maari.mahmoud.vendingmachine.Dao.BuyProduct;
import maari.mahmoud.vendingmachine.Dao.Food;
import maari.mahmoud.vendingmachine.models.Product;

public class Cases {

	public static final Scanner in = new Scanner(System.in);
	public static final Scanner ins = new Scanner(System.in);
	public static Scanner s = new Scanner(System.in);

	public void run ( ) {
		boolean run = true, no = false, again = true;
		int[] m = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000 };
		int[] chang = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000 };
		int[] denominations = new int[0];
		int amount = 0;
        Product Pizza = new Product("Pizza", 59);
        Product Chocolate = new Product("Snickers", 5);
        Product Coca = new Product("Coca cola", 10);
		BuyProduct buyProduct = new Food();
		System.out.println("========== menu ========== ");
		System.out.println("Pizza price is 59kr:- \n" + "Snickers price is 5kr:- \n" + "Coca cola price is 10kr:-");
		System.out.println("*********************");
		int input = 0;
		
			

			
			while (run) {
				for (int i = 0; i < denominations.length; i++) {
					denominations[i] = amount;
				}
				MoneyInput money= new MoneyInput();
				amount =money.input(input, amount);
				do {
					System.out.println(" press (1) for Pizza = " + Pizza.getPrice() + " kr:-" + "\n press (2) for Snickers = "
							+ Chocolate.getPrice() + "kr:-" + "\n press (3) for Coca cola = " + Coca.getPrice() + "kr:-"
							+ "\n press (4) to leave");
					String op = s.nextLine();
					switch (op) {
					case "1":
						if (amount < Pizza.getPrice()) {

							System.out.println("not enough money" + "\nput more money plase");
							input = in.nextInt();
							amount += input;
							System.out.println("Your money : " + amount + "kr:-");

						}
						if (amount >= Pizza.getPrice()) {

							amount = buyProduct.buy(amount, Pizza);
							System.out.println("your money : " + amount + "kr:-" + "\nyour food is ready  to eat");
							no = true;
						}
						run = false;
						break;
					case "2":
						if (amount < Chocolate.getPrice()) {
							System.out.println("not enough money" + "\nput more money plase");
							input = in.nextInt();
							amount += input;
							System.out.println(amount);

						}
						if (amount >= Chocolate.getPrice()) {
							amount = buyProduct.buy(amount, Chocolate);
							System.out.println("your money : " + amount + "kr:-" + "\nyour snake is ready to eat");
							no = true;
						}
						run = false;
						break;
					case "3":
						if (amount < Coca.getPrice()) {
							System.out.println("not enough money" + "\nput more money plase");
							input = in.nextInt();
							amount += input;
							System.out.println(amount);

						}
						if (amount >= Coca.getPrice()) {
							amount = buyProduct.buy(amount, Coca);
							System.out.println("your money : " + amount + "kr:-" + "\nyour drik is ready to drink");
							no = true;
						}
						run = false;
						break;
					case "4":
						run = false;
						no = true;
						again = false;
						break;
					default:
						System.out.println("not valid number");
						no = true;
					}

				} while (!no);
					if(again == true) {
					System.out.println("Press (y) if you want to buy again or (n) to end");
					String answer=s.nextLine();
					run=BuyAgain.buyagain(answer);
					}
				if (run == false) {
					System.out.println("return money : " + amount + "kr:-");
					amount = buyProduct.money(chang, amount);
					for (int i = 0; i < chang.length; i++) {
						if (chang[i] != 0) {
							System.out.println("your chang : " + chang[i] + "st" + " x " + m[i] + " kr:-");
						}
					}
				}
			}
		}
	}

