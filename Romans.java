import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
public class Romans {

	public static int[] numbers = { 1000, 900, 500, 400, 100, 90, 
			50, 40, 10, 9, 5, 4, 1 };
	public static String[] letters = { "M", "CM", "D", "CD", "C", 
			"XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	public static int value(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

	public static int toInt(String rom) {
		char[] roman = rom.toCharArray();

		int total = 0;
		for (int i = roman.length - 1; i > -1; i--) {
			switch (roman[i]) {
			case 'I':
				total += value(roman[i]);
				break;
			case 'V':
			case 'X':
			case 'L':
			case 'C':
			case 'D':
			case 'M':
				if (i != 0 && (value(roman[i - 1]) < value(roman[i]))) {
					total += value(roman[i]) - value(roman[i - 1]);
					i--;
				} else {
					total += value(roman[i]);
				}
				break;
			}
		}
		return total;
	}

	public static String toRoman(int total) {
		String roman = "";
		int N = total;
		
		for(int i = 0; i < numbers.length; i++){
			while (N >= numbers[i]){
				roman += letters[i];
				N -= numbers[i];
			}
		}
		return roman;
	}
	
}
