package tech.lemyted.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ConverterTest
{
	@Test
	public void whenStrIsValidBinary_isValid_returnsTrue_case1() 
	{
		assertTrue(Converter.isValid("0000"));
		
	}
	
	@Test
	public void whenStrIsValidBinary_isValid_returnsTrue_case2() 
	{
		assertTrue(Converter.isValid("1111"));
		
	}
	
	@Test
	public void whenStrIsValidBinary_isValid_returnsTrue_case3() 
	{
		assertTrue(Converter.isValid("1010"));
		
	}
	
	@Test
	public void whenStrIsValidBinary_isValid_returnsTrue_case4() 
	{
		assertTrue(Converter.isValid("101011110000"));
		
	}
	
	@Test
	public void whenStrIsValidBinary_isValid_returnsTrue_case5() 
	{
		assertTrue(Converter.isValid("0011111110000"));
		
	}
	
	@Test
	public void whenStrIsInvalidBinary_isValid_returnsFalse_caseWithLetters() 
	{
		assertFalse(Converter.isValid("aaaa"));
		
	}
	
	@Test
	public void whenStrIsInvalidBinary_isValid_returnsFalse_caseWithHyphen() 
	{
		assertFalse(Converter.isValid("1111-1111"));
		
	}
	
	@Test
	public void whenStrIsInvalidBinary_isValid_returnsFalse_caseWithOtherDigits() 
	{
		assertFalse(Converter.isValid("2222"));
		
	}
	
	@Test
	public void whenStrIsInvalidBinary_isValid_returnsFalse_caseWithNewLine() 
	{
		assertFalse(Converter.isValid("1111/n"));
		
	}
	
	@Test
	public void whenStrIsInvalidBinary_isValid_returnsFalse_caseWithEmpty() 
	{
		assertFalse(Converter.isValid(""));
		
	}
	
	@Test
	public void whenStrIsInvalidBinary_isValid_returnsFalse_caseWithNul() 
	{
		assertFalse(Converter.isValid(null));
		
	}
	
	@Test
	public void whenNBitsIsNegative_pad_isNotPadded()
	{
		assertEquals("00", Converter.pad("00", -1));
	}
	
	@Test
	public void whenNBitsIsZero_pad_isNotPadded()
	{
		assertEquals("001", Converter.pad("001", 0));
	}
	
	@Test
	public void whenStrHasLessThanNBits_pad_isPadded()
	{
		assertEquals("00000000000000000000000000010101", Converter.pad("10101", 32));
	}
	
	@Test
	public void whenStrHasNBits_pad_isNotPadded()
	{
		assertEquals("10000000000000000000000000000001", Converter.pad("10000000000000000000000000000001", 32));
	}
	
	@Test
	public void whenStrHasMoreThanNBits_pad_isNotPadded()
	{
		assertEquals("10000000000000000000000000000011", Converter.pad("10000000000000000000000000000011", 32));
	}
}
