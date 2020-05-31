package assignment;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import junit.framework.Assert;

@Category(IntegrationTest.class)
public class ITTests {

	@Test
	public void ItRevers() {
		StringConverter conv = new StringConverter();
		StringOperations opr = new StringOperations();
		int value = 11209;
		String expected = "ila";
		
		String out = conv.NumberToString(value);
		
		Assert.assertEquals(expected, opr.getReverse(out));
		
	}

}
