package org.kata.RomanNumerals;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class RomanNumeralsTest {

  RomanNumerals roman = null;

  @Before
  public void setUp() {
    this.roman = new RomanNumerals();
  }

  @Test
  public void testOne() {
    assertEquals("I", this.roman.getRomanNumerals(1));
  }

  @Test
  public void testTwo() {
    assertEquals("II", this.roman.getRomanNumerals(2));
  }

  @Test
  public void testThree() {
    assertEquals("III", this.roman.getRomanNumerals(3));
  }

  @Test
  public void testFour() {
    assertEquals("IV", this.roman.getRomanNumerals(4));
  }

  @Test
  public void testFive() {
    assertEquals("V", this.roman.getRomanNumerals(5));
  }

  @Test
  public void testSix() {
    assertEquals("VI", this.roman.getRomanNumerals(6));
  }
  
  @Test
  public void testSeven() {
    assertEquals("VII", this.roman.getRomanNumerals(7));
  }

  @Test
  public void testEight() {
    assertEquals("VIII", this.roman.getRomanNumerals(8));
  }

  @Test
  public void testNine() {
    assertEquals("IX", this.roman.getRomanNumerals(9));
  }

  @Test
  public void testTen() {
    assertEquals("X", this.roman.getRomanNumerals(10));
  }

  @Test
  public void testEleven() {
    assertEquals("XI", this.roman.getRomanNumerals(11));
  }

}
