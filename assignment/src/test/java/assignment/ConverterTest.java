package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ConverterTest {

	@Test
	public void happyPathConverter() {
		int value = 11209;
		StringConverter converter = new StringConverter();
		Assert.assertEquals("ali", converter.NumberToString(value));
	}

}
