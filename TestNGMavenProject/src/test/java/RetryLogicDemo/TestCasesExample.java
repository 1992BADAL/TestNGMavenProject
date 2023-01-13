package RetryLogicDemo;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestCasesExample {
	
	@Test(priority=2)
	public void TestCase01() {
		
		Assert.assertTrue(false);//test case will failed
	}
	
	@Test(priority=0)
	public void TestCase02() {
		
		Assert.assertTrue(false);//test case will failed
	}
	
	
	
	
	
	
	@Test(retryAnalyzer = RetryAnalyser.class)
	public void TestCase03() {
		
		Assert.assertTrue(true);//test case will passed
	}

}
