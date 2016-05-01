package stratege.version8.pattern1;

import java.util.List;
import java.util.function.Predicate;

import stratege.version8.pattern1.Asset.AssetType;

public class AssetUtilRefactored {

	public static int totalAssetValues(final List<Asset> assets,
			final Predicate<Asset> assetSelector) {
		
		return assets.stream()
				.filter(assetSelector)
				.mapToInt(Asset::getValue)
				.sum();
	}
	
	//良い例かは分からないが、このようなこともできる。
	public static Predicate<Asset> EXPRESSION_2() {
		return asset -> asset.getType() == AssetType.BOND;
	}
}
