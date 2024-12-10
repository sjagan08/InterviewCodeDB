package Automation.Selenium;

public class StringToInteger {

	public static void main(String[] args) {
		String input = "$180,240/y";
	
		int output = Integer.parseInt(input.replaceAll("[^0-9]", ""));
		System.out.println(output);
	}
}
