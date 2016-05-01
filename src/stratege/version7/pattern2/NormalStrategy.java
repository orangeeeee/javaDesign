package stratege.version7.pattern2;

public class NormalStrategy implements BillingStrategy {
	
	@Override
	public double getActPrice(double rawPrice) {
		return rawPrice;
	}
}
