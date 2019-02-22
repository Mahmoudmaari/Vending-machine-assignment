package maari.mahmoud.vendingmachine.Dao;

import maari.mahmoud.vendingmachine.models.Product;

public class Snaks implements BuyProduct{

	@Override
	public int buy(int amount, Product product) {
		
		return amount -= product.getPrice();
	}

	@Override
	public int money(int[] change, int amount) {

		change[0] = amount % 1000 % 500 % 200 % 100 % 50 % 20 % 10 % 5 % 2 / 1;
		change[1] = amount % 1000 % 500 % 200 % 100 % 20 % 50 % 10 % 5 / 2;
		change[2] = amount % 1000 % 500 % 200 % 100 % 50 % 20 % 10 / 5;
		change[3] = amount % 1000 % 500 % 200 % 100 % 50 % 20 / 10;
		change[4] = amount % 1000 % 500 % 200 % 100 % 50 / 20;
		change[5] = amount % 1000 % 500 % 200 % 100 / 50;
		change[6] = amount % 1000 % 500 % 200 / 100;
		change[7] = amount % 1000 % 500 / 200;
		change[8] = amount % 1000 / 500;
		change[9] = amount / 1000;
	
		return 0;
	}

	

}
