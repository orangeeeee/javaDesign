package stratege.version7.pattern1;

public interface Evaluator {

	public static final int SKIP = -1;
	public static final int VALID = 0;
	public static final int INVALID = 1;

	public int evalute(Parameter[] params) throws Exception;

}
