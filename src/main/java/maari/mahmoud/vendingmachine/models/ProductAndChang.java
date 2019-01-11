package maari.mahmoud.vendingmachine.models;

public class ProductAndChang implements MoneyChang {

	@Override
	public int buy(int amount, int price) {

		return amount -= price;
	}

	@Override
	public int money(int[] chang, int amount) {

		chang[0] = amount % 1000 % 500 % 200 % 100 % 50 % 20 % 10 % 5 % 2 / 1;
		chang[1] = amount % 1000 % 500 % 200 % 100 % 20 % 50 % 10 % 5 / 2;
		chang[2] = amount % 1000 % 500 % 200 % 100 % 50 % 20 % 10 / 5;
		chang[3] = amount % 1000 % 500 % 200 % 100 % 50 % 20 / 10;
		chang[4] = amount % 1000 % 500 % 200 % 100 % 50 / 20;
		chang[5] = amount % 1000 % 500 % 200 % 100 / 50;
		chang[6] = amount % 1000 % 500 % 200 / 100;
		chang[7] = amount % 1000 % 500 / 200;
		chang[8] = amount % 1000 / 500;
		chang[9] = amount / 1000;
		return 0;
	}

}
