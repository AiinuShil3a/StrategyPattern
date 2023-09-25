
public class ShoppingCart {
	private  Payment payment;
	
	public ShoppingCart() {
		this.payment = new cashPayment();
	}
	
	public void setPayment(Payment strategy) {
		this.payment = strategy;
	}
	
	public void checkout(int amount) {
		payment.pay(amount);
	}
}
