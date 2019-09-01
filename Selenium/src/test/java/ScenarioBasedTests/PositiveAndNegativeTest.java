package ScenarioBasedTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveAndNegativeTest {
	
	
	boolean isNumeric(String s)
	{
		
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
		
	}

	
	@DataProvider(name="data")
	Object[][]data()
	{
		return new Object[][]
				{
			{"123"},
			{"-123"}
				};
	}
	
	
	
	@Test(dataProvider="data")
	void isNumericTest(String input)
	{
		Assert.assertTrue(isNumeric(input));
	}
	
	
	
	

	@DataProvider(name="invaliddata")
	Object[][] invaliddata()
	{
		return new Object[][]
				{
			{"abc"},
			{"abc123"},
			{""},
			{null},
			{"21474836479"},
			{"123.23"},
				};
	}
	
	
	
	@Test(dataProvider="invaliddata")
	void isNumericTestinavlidTest(String input)
	{
		Assert.assertFalse(isNumeric(input));
	}
	
	
}


