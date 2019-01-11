package maari.mahmoud.vendingmachine;

public class BuyAgain {
	public static boolean buyagain(String answer) {
		String upperCaseString = answer.toUpperCase();
		switch(upperCaseString) {
		case "Y":
			return true;
		default:
			System.out.println("**********good bye**********");
			return false;
		}

	}
	public static boolean moremoney(String answer) {
		String upperCaseString = answer.toUpperCase();
		switch(upperCaseString) {
		case "Y":
			return false;
		default:
			
			return true;
		}

	}


}
