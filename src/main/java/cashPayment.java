
public class cashPayment implements Payment {

	@Override
	public void pay(int amount) {
		System.out.println("Cash is " + amount);
	}

}