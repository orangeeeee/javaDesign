package stratege.version8.pattern1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import stratege.version8.pattern1.Asset.AssetType;

public class DemoMain {
	public static void main(String[] args) {
//		
//		Function<String, > testFunct = new Function<T, R>() {
//			
//			return "";
//		};
		
		
		// TODO Auto-generated method stub
	    List<Asset> assets = Arrays.asList(
	    	      new Asset(Asset.AssetType.BOND, 1000),
	    	      new Asset(Asset.AssetType.BOND, 2000),
	    	      new Asset(Asset.AssetType.STOCK, 3000),
	    	      new Asset(Asset.AssetType.STOCK, 4000)
	    	    );

	    //式を定義しておくこともできる。
		Predicate<Asset> assetSelector = (asset) -> true;
		
	    System.out.println("Total of all assets: " + 
	    		AssetUtilRefactored.totalAssetValues(assets, asset -> true));
	    
	    System.out.println("Total of all assets: " + 
	    		AssetUtilRefactored.totalAssetValues(assets, assetSelector));

	    System.out.println("Total of bonds: " + 
	    		AssetUtilRefactored.totalAssetValues(assets, asset -> asset.getType() == AssetType.BOND));

	    System.out.println("Total of bonds: " + 
	    		AssetUtilRefactored.totalAssetValues(assets, AssetUtilRefactored.EXPRESSION_2()));

	    System.out.println("Total of stocks: " + 
	    		AssetUtilRefactored.totalAssetValues(assets, asset -> asset.getType() == AssetType.STOCK));
	    	  
	}

}
