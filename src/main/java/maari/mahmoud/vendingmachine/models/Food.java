package maari.mahmoud.vendingmachine.models;

public class Food implements MoneyChang {

	@Override
	public int buy(int amount, int foodprice) {
		
		return amount-=foodprice;
	}

	@Override
	public int money(int[] chang, int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	

}
