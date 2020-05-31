package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class OperationsTest {

	@Test
	public void reverseTest() {
		StringOperations opr = new StringOperations();
		String value = "ila";
		String expected = "ali";
		Assert.assertEquals(expected, opr.getReverse(value));
	}

}
