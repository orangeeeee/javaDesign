package stratege.version7.pattern1;

/**
 * Contextクラス
 */
public class ParameterManager {

	protected Evaluator evaluator;
	
	public void store(Parameter[] params) throws Exception {
		
		int status = evaluator.evalute(params);
		
		switch(status) {
		
		case Evaluator.SKIP:
			System.out.println("パラメーターの保存をスキップしました。");
			break;
		case Evaluator.VALID:
			System.out.println("パラメーターの保存をスキップしました。");
			save(params);
			break;
		case Evaluator.INVALID:
			System.out.println("パラメーターが不正です。保存されません。");
			break;
		}
	}
	
	protected void save(Parameter[] params) throws Exception {
		
	
	}

	public Evaluator getEvaluator() {
		return evaluator;
	}

	public void setEvaluator(Evaluator evaluator) {
		this.evaluator = evaluator;
	}
}
