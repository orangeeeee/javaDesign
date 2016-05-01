package stratege.version7.pattern1;

public class Parameter {

	public static final int SKIP = -1;
	public static final int VALID = 0;
	public static final int INVALID = 1;
	
	private String key;
	private String value;
	
	public int validate() throws Exception {
		
		int result = VALID;
		
		if(value == null) {
			result = SKIP;
		} else if(value.trim().length() == 0) {
			result = INVALID;
		}
		
		return result;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
