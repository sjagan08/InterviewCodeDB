package Automation.Selenium;

import java.math.BigInteger;

public class Fractional {
	public static void main(String[] args) {

		int[] n = { 10, 100, 1000 };

		for (int num : n) {
			BigInteger fractional = BigInteger.ONE;
			String output = "";
			for (int i = 2; i <= num; i++) {
				fractional = fractional.multiply(BigInteger.valueOf(i));
			}
			if(fractional.toString().length() <=10) {
				output = fractional.toString();                           
			} else {
			output = fractional.toString().substring(0, 10);
			}
			System.out.println(num + " : " + output);
		}
	}
}
