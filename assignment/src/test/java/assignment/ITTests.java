package assignment;

import static org.junit.Assert.*;

import java.util.Random;

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
	@Test
	public void ItUpper() {
		StringConverter conv = new StringConverter();
		StringOperations opr = new StringOperations();
		int value = 11209;
		String expected = "ALI";
		
		String out = conv.NumberToString(value);
		
		Assert.assertEquals(expected, opr.getUpper(out));
	}
	@Test
	public void ItUpperRand() {
		StringConverter conv = new StringConverter();
		StringOperations opr = new StringOperations();
		int value = new Random().nextInt(9999);
		String out = conv.NumberToString(value);
		
		String expected = out.toUpperCase();
		
		
		Assert.assertEquals(expected, opr.getUpper(out));
	}

}
