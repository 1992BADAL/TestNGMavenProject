package RetryLogicDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer{
	
	public void transform(ITestAnnotation testAnnotation, Class testClass,
			Constructor testConstractor, Method testMethod) {
		
		testAnnotation.setRetryAnalyzer(RetryAnalyser.class);
		
	}
	

}
