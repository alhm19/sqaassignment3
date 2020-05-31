package assignment;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import junit.framework.Assert;

public class ConverterTest {

	@Test
	public void happyPathConverter() {
		int value = 11209;
		StringConverter converter = new StringConverter();
		Assert.assertEquals("ali", converter.NumberToString(value));
	}
	@Test
	public void boundaryConverter() {
		int value = new Random().nextInt(999999);
		StringConverter converter = new StringConverter();
		Assert.assertNotNull(converter.NumberToString(value));
	}

}
