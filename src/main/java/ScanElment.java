
public class ScanElment implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("Scan qr code is " + amount);
		
	}

}
