package org.kata.RomanNumerals;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class RomanNumeralsTest {

  RomanNumerals roman = null;

  public final String[] UnitsDigits = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

  @Before
  public void setUp() {
    this.roman = new RomanNumerals();
  }

  @Test
  public void testOneToTen() {
    for (int num=1; num<=10; num++) {
      assertEquals(UnitsDigits[num-1], this.roman.getRomanNumerals(num));
    }
  }

  @Test
  public void testEleven() {
    assertEquals("XI", this.roman.getRomanNumerals(11));
  }

}
