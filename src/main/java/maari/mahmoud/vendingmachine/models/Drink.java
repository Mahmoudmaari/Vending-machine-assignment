package maari.mahmoud.vendingmachine.models;

public class Drink implements MoneyChang{

	@Override
	public int buy(int amount, int drinkprice) {
		// TODO Auto-generated method stub
		return amount-=drinkprice;
	}

	@Override
	public int money(int[] chang, int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
