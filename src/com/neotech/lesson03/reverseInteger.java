package com.neotech.lesson03;

public class reverseInteger {

	public static void main(String[] args) {

		int num = 12345;
		String reverse = "";
		
		for (int i =5; i > 0; i--)
		{
			reverse += num%10;
			num=num/10;
		}
		System.out.println(reverse);


		
	}

}
