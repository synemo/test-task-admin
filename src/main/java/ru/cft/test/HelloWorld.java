package ru.cft.test;

public class HelloWorld {
	private static final String DefaultString = "Hello World!";
	public static void main(String[] args) {
		String data = (args.length > 0)? args[0] : DefaultString;
		System.out.println(data);
	}
} 