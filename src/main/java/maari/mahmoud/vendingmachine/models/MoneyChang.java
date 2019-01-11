package maari.mahmoud.vendingmachine.models;

public interface MoneyChang {

	int[] chang = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000 };

	int buy(int amount, int price);

	int money(int[] chang, int amount);

	default int getcal(int amount, int price, String op) {

		 switch (op) {
		case "1":
			return buy(amount, price);

		case "2":
			return money(chang, amount);
		default:
			throw new IllegalArgumentException("Number " + op + " is not valid number");
		}

	}

}
