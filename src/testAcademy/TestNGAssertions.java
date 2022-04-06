package testAcademy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertions {

	@Test
	public void assertTrueExample () {
	    //If check is true, test will pass.
	    System.out.println("AssertTrue Example");
	    String myString = "swtestacademy.com";
	    //Condition, Message
	    Assert.assertTrue(myString.equals("swtestacademy.com"), "AssertTrue test is failed!");
	    System.out.println("AssertTrue test is Passed!\n");
	}
	
	@Test
	public void assertFalseExample () {
	    //If check is false, test will pass.
	    System.out.println("AssertFalse Example");
	    String myString = "swtestacademy.com";
	    //Condition, Message
	    Assert.assertFalse(myString.equals("Wrong-String"), "AssertFalse test is failed!");
	    System.out.println("AssertFalse Test is Passed!\n");
	}
	
	@Test
	public void assertEqualsExample () {
	    System.out.println("AssertEquals Example");
	    String myString = "swtestacademy.com";
	    //Actual String, Expected String, Message
	    Assert.assertEquals("swtestacademy.com", myString, "AssertEquals test is failed!");
	    System.out.println("AssertEquals Test is Passed!\n");
	}
	
}
