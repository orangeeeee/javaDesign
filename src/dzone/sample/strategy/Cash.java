package dzone.sample.strategy;

public class Cash implements PaymentMethod {

	@Override
	public void pay(int cents) {
		// TODO Auto-generated method stub
		System.out.println("Payed" + cents + "cents using cash");
		
	}

}
