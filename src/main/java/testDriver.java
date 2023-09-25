
public class testDriver {
	public static void main(String[] args) {
		ShoppingCart cart1 = new ShoppingCart();
		cart1.checkout(1500);
		cart1.setPayment(new creditPayment());
		cart1.checkout(2000);
		cart1.setPayment(new ScanElment());
		cart1.checkout(10000);
	}
}
