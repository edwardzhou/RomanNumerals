package org.kata.RomanNumerals;

public class RomanNumerals {

  public String numberToString(int num, char unit, char half, char carry) {
    char[] units = {unit, unit, unit};

    if (num <= 0) {
      return "";
    } else if (num <4) {
      return String.valueOf(units, 0, num);
    } else if (num == 4) {
      return String.valueOf(new char[]{unit, half});
    } else if (num == 5) {
      return String.valueOf(half);
    } else if (num < 9) {
      return String.valueOf(half) + String.valueOf(units, 0, num - 5);
    } else if (num == 9) {
      return String.valueOf(new char[]{unit, carry});
    } else {
      return String.valueOf(carry);
    }
  }

  public String getRomanNumerals(int num) {
    StringBuffer buffer = new StringBuffer();

    // N/A for out of range.
    if (num >= 5000 || num <= 0) {
      return "N/A";
    }

    int digit;

    // thousand
    digit = num / 1000;
    buffer.append(numberToString(digit, 'M', ' ', ' '));
    
    // centum
    num = num % 1000;
    digit = num / 100;
    buffer.append(numberToString(digit, 'C', 'D', 'M'));
    
    // decade
    num = num % 100;
    digit = num / 10;
    buffer.append(numberToString(digit, 'X', 'L', 'C'));
    
    // unit
    digit = num % 10;
    buffer.append(numberToString(digit, 'I', 'V', 'X'));
    
    return buffer.toString();
  }
}
