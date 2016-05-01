package stratege.version7.pattern1;

public class ExecuteTest {

	public static void main(String[] args) throws Exception {
		
		//-- create test data ---//
		Parameter[] params = new Parameter[3];
		
		Parameter param0 = new Parameter();
		param0.setKey("key");
		param0.setValue("value");
		params[0] = param0;
		
		Parameter param1 = new Parameter();
		param1.setKey("key1");
		param1.setValue("value1");
		params[1] = param1;
		Parameter param2 = new Parameter();
		param2.setKey("key2");
		param2.setValue("value2");
		params[2] = param2;
		//-------------------------//
		
		ParameterManager pm = new ParameterManager();
		
		Evaluator eval1 = new ANDEvaluator();
		Evaluator eval2 = new StrongANDEvaluator();
		Evaluator eval3 = new OREvaluator();
		
		pm.setEvaluator(eval1);
		pm.store(params);
		
		pm.setEvaluator(eval2);
		pm.store(params);
		
		pm.setEvaluator(eval3);
		pm.store(params);
	}

}
