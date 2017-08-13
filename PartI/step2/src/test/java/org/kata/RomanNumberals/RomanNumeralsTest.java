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
  public void test_11() {
    assertEquals("XI", this.roman.getRomanNumerals(11));
  }

  @Test
  public void test_12() {
    assertEquals("XII", this.roman.getRomanNumerals(12));
  }

  @Test
  public void test_13() {
    assertEquals("XIII", this.roman.getRomanNumerals(13));
  }
  
  @Test
  public void test_14() {
    assertEquals("XIV", this.roman.getRomanNumerals(14));
  }

  @Test
  public void test_20() {
    assertEquals("XX", this.roman.getRomanNumerals(20));
  }

  @Test
  public void test_40() {
    assertEquals("XL", this.roman.getRomanNumerals(40));
  }

  @Test
  public void test_49() {
    assertEquals("XLIX", this.roman.getRomanNumerals(49));
  }

  @Test
  public void test_50() {
    assertEquals("L", this.roman.getRomanNumerals(50));
  }

  @Test
  public void test_55() {
    assertEquals("LV", this.roman.getRomanNumerals(55));
  }

  @Test
  public void test_80() {
    assertEquals("LXXX", this.roman.getRomanNumerals(80));
  }

  @Test
  public void test_100() {
    assertEquals("C", this.roman.getRomanNumerals(100));
  }

  @Test
  public void test_369() {
    assertEquals("CCCLXIX", this.roman.getRomanNumerals(369));
  }

  @Test
  public void test_1998() {
    assertEquals("MCMXCVIII", this.roman.getRomanNumerals(1998));
  }

  @Test
  public void test_2751() {
    assertEquals("MMDCCLI", this.roman.getRomanNumerals(2751));
  }

  @Test
  public void test_5000() {
    assertEquals("N/A", this.roman.getRomanNumerals(5000));
  }
}
