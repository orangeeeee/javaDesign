package dzone.sample.strategy;

public class ApplicationExec {
	private static final int PAYMENT_TYPE_INDEX = 0;

	public static void main(String[] args) {
		Bill bill = new Bill();
		bill.addLineItem(new LineItem("Milk", 200));
		bill.addLineItem(new LineItem("Bread", 150));
		bill.pay(PaymentMethodFactory.getPaymentMethod("credit"));

	}
}