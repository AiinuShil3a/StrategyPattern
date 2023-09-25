
public class creditPayment implements Payment {

	@Override
	public void pay(int amount) {
		System.out.println("Credit is " + amount);
	}

}
