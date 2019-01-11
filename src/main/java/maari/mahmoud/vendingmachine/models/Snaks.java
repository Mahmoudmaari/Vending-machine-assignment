package maari.mahmoud.vendingmachine.models;

public class Snaks implements MoneyChang {

	@Override
	public int buy(int amount, int snaksprice) {
		
		return amount-=snaksprice;
	}

	@Override
	public int money(int[] chang, int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
