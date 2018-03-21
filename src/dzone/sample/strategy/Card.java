package dzone.sample.strategy;

import java.text.MessageFormat;

public abstract class Card implements PaymentMethod {

	private final String nameOnCard;
	private final String number;
	private final String cvv;
	private final String expirationDate;

	public Card(String nameOnCard, String number, String cvv, String expirationDate) {
		// initialize final member variable.(初期化)
		this.nameOnCard = nameOnCard;
		this.number = number;
		this.cvv = cvv;
		this.expirationDate = expirationDate;
	}

	@Override
	public String toString() {
		return MessageFormat.format("{0} card[name = {1}, number = {2}, CVV = {3}, expiration = {4}]", getType(),
				nameOnCard, number, cvv, expirationDate);
	}

	@Override
	public void pay(int cents) {
		System.out.println("Payed " + cents + " cents using " + toString());
	}

	/**
	 * カードのタイプを返す。
	 * 
	 * @return カードタイプ
	 */
	protected abstract String getType();

	/**
	 * 
	 * @param cents
	 */
	protected abstract void executeTransaction(int cents);

}
