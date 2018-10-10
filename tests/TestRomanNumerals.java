import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void convertToInteger_I_1() throws RomanNumeralsInvalidFormatException{
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("I");
		//Assert
		assertEquals(1, res);
	}
	
	@Test
	public void convertToInteger_V_5() throws RomanNumeralsInvalidFormatException{
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("V");
		//Assert
		assertEquals(5, res);
	}
	
	@Test
	public void convertToInteger_X_10() throws RomanNumeralsInvalidFormatException{
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("X");
		//Assert
		assertEquals(10, res);
	}
	
	@Test
	public void convertToInteger_L_50() throws RomanNumeralsInvalidFormatException{
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("L");
		//Assert
		assertEquals(50, res);
	}
	
	@Test
	public void convertToInteger_C_100() throws RomanNumeralsInvalidFormatException{
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("C");
		//Assert
		assertEquals(100, res);
	}
	
	@Test
	public void convertToInteger_D_500() throws RomanNumeralsInvalidFormatException{
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("D");
		//Assert
		assertEquals(500, res);
	}
	
	@Test
	public void convertToInteger_M_1000() throws RomanNumeralsInvalidFormatException{
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("M");
		//Assert
		assertEquals(1000, res);
	}
	
	@Test
	public void convertToInteger_III_3() throws RomanNumeralsInvalidFormatException{
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("III");
		//Assert
		assertEquals(3, res);
	}
	
	@Test
	public void convertToInteger_XXX_30() throws RomanNumeralsInvalidFormatException{
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("XXX");
		//Assert
		assertEquals(30, res);
	}
	
	@Test
	public void convertToInteger_CCC_300() throws RomanNumeralsInvalidFormatException{
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("CCC");
		//Assert
		assertEquals(300, res);
	}
	
	@Test
	public void convertToInteger_MMM_3000() throws RomanNumeralsInvalidFormatException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("MMM");
		//Assert
		assertEquals(3000, res);
	}
	
	@Test (expected = RomanNumeralsInvalidFormatException.class)
	public void convertToInteger_VV_notvalid() throws RomanNumeralsInvalidFormatException{
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("VV");

	}
	
	@Test (expected = RomanNumeralsInvalidFormatException.class)
	public void convertToInteger_LL_notvalid() throws RomanNumeralsInvalidFormatException{
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("LL");

	}
	
	@Test (expected = RomanNumeralsInvalidFormatException.class)
	public void convertToInteger_DD_notvalid() throws RomanNumeralsInvalidFormatException{
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("DD");

	}
	
	@Test (expected = RomanNumeralsInvalidFormatException.class)
	public void convertToInteger_IIII_notvalid() throws RomanNumeralsInvalidFormatException{
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("IIII");

	}
	
	@Test (expected = RomanNumeralsInvalidFormatException.class)
	public void convertToInteger_XXXX_notvalid() throws RomanNumeralsInvalidFormatException{
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("XXXX");

	}
	
	@Test (expected = RomanNumeralsInvalidFormatException.class)
	public void convertToInteger_CCCC_notvalid() throws RomanNumeralsInvalidFormatException{
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("CCCC");

	}
	
	@Test (expected = RomanNumeralsInvalidFormatException.class)
	public void convertToInteger_MMMM_notvalid() throws RomanNumeralsInvalidFormatException{
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("MMMM");

	}
	
	@Test
	public void convertToInteger_IV_4() throws RomanNumeralsInvalidFormatException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("IV");
		//Assert
		assertEquals(4, res);
	}
	
	@Test
	public void convertToInteger_IX_9() throws RomanNumeralsInvalidFormatException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("IX");
		//Assert
		assertEquals(9, res);
	}
	
	@Test
	public void convertToInteger_XL_40() throws RomanNumeralsInvalidFormatException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("XL");
		//Assert
		assertEquals(40, res);
	}
	
	@Test
	public void convertToInteger_XC_90() throws RomanNumeralsInvalidFormatException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("XC");
		//Assert
		assertEquals(90, res);
	}
	
	@Test
	public void convertToInteger_CD_400() throws RomanNumeralsInvalidFormatException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("CD");
		//Assert
		assertEquals(400, res);
	}
	
	@Test
	public void convertToInteger_CM_900() throws RomanNumeralsInvalidFormatException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("CM");
		//Assert
		assertEquals(900, res);
	}
	
	@Test
	public void convertToInteger_XXIV_24() throws RomanNumeralsInvalidFormatException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("XXIV");
		//Assert
		assertEquals(24, res);
	}
	
	@Test (expected = RomanNumeralsInvalidFormatException.class)
	public void convertToInteger_VL_invalid() throws RomanNumeralsInvalidFormatException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("VL");
		
	}
	
	@Test (expected = RomanNumeralsInvalidFormatException.class)
	public void convertToInteger_LC_invalid() throws RomanNumeralsInvalidFormatException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("LC");
		
	}
	
	@Test (expected = RomanNumeralsInvalidFormatException.class)
	public void convertToInteger_DM_invalid() throws RomanNumeralsInvalidFormatException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("DM");
		
	}
	
	@Test (expected = RomanNumeralsInvalidFormatException.class)
	public void convertToInteger_IVXMM_invalid() throws RomanNumeralsInvalidFormatException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		//Act
		int res = converter.convertToInteger("IVXMM");
		
	}
}
