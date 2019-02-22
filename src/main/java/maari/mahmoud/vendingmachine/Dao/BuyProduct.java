package maari.mahmoud.vendingmachine.Dao;

import maari.mahmoud.vendingmachine.models.Product;

public interface BuyProduct {

	int buy (int amount,Product product);
	
	int money(int[] chang, int amount);
	
}
