//
//Copyright (c) 2023 Promineo Tech
//Author:  Promineo Tech Academic Team
//Subject: Arrays & Methods
//Java Week 03 Lab
//
package week03;
import java.util.*;
import java.lang.*;
import java.util.*;


public class week03_labs {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] values = new int[6];
		
		values[0] = 1;
		values[1] = 5;
		values[2] = -3;
		values[3] = 8;
		values[4] = 13;
		values[5] = 6;

		
		// 2. Print out the first element in the array
		System.out.println(values[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(values[values.length-1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		  //System.out.println(values[6]); 
		  //**it throws an exception because the value 6 is out of bounds
		
		// 5. Print out the element in the array at position -1, what happens?
		  //System.out.println(values[-1]);
		  //**it throws an exception because the value -1 is out of bounds
		
		// 6. Write a traditional for loop that prints out each element in the array
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for (int value : values) {
			System.out.println(value);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		for (int value:values) {
			sum += value;
		}
		System.out.println(sum);
		
		// 9. Create a new variable called average and assign the average value of the array to it
		double average = sum / values.length;
		System.out.println(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for (int value:values) {
			if (value % 2 != 0) {
				System.out.println(value);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = new String[4];
		
		names[0] = "Sam";
		names[1] = "Sally";
		names[2] = "Thomas";
		names[3] = "Robert";
		
		// 12. Calculate the sum of all the letters in the new array
		int sumLetters = 0;
		
		for (String name : names) {
			int nameLength = name.length();
			sumLetters += nameLength;
		}
		System.out.println(sumLetters);
	
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.	
		greet("Tom");

	
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		String hi = greeting("Eliot");
		System.out.println(hi);
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		//**method 13 performs an action, method 14 returns something but doesn't perform any direct action
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println(isStringLongerThan("Maria", 14));
		System.out.println(isStringLongerThan("Maria", 3));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println(stringInArray(names, "testing"));
		System.out.println(stringInArray(names, "Sally"));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println(findSmallest(values));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] doubles = {45.7, 30.2, 67.3};
		System.out.println(calculateAverage(doubles));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		int[] nameLengths = printStringLength(names);
		for (int num : nameLengths) {
			System.out.println(num);
		}
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println(stringCompareEvenOdd(names));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		System.out.println(isPalindrome("boob"));
		System.out.println(isPalindrome("Kook"));
		System.out.println(isPalindrome("kook"));
	}
	// Method 13
	public static void greet(String name) {
		System.out.println("Hello, " + name + "!");
	}

	// Method 14:
	public static String greeting(String userName) {
		return("Hello, " + userName + "!");
	}
	
	// Method 15:
	public static boolean isStringLongerThan(String word, int number) {
		//boolean longer = false;
		//if(word.length() > number) {
		//	longer = true;
		//} else {
		//	longer = false;
		//}
		//return longer;
	//}
		return (word.length()  > number);
	}
	// Method 16:
	public static boolean stringInArray(String[] array, String string) {
		for (String str:array) {
			if(str.equals(string)) {
				return true;
			}
		}
		return false;
	}
	// Method 17:
	public static int findSmallest (int[] numberArray) {
			int smallest = numberArray[0];
			for (int num:numberArray) {
				if (num < smallest) {
					smallest = num;
				}
		}
			return smallest;
	}
	
	
	// Method 18:
	public static double calculateAverage (double[] doubles) {
		double sum = 0;
		for (double num : doubles) {
			sum += num;
		}
		return sum / doubles.length;		
	}
	
	// Method 19:
	public static int[] printStringLength (String[] array) {
		int[] results = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			results[i] = array[i].length();
		}
		return results;
	}

	
	// Method 20:
	public static boolean stringCompareEvenOdd (String[] words) {
		int sumEven = 0;
		int sumOdd = 0;
		for (String str : words) {
			if (str.length() % 2 == 0) {
				sumEven += str.length();
			} else {
				sumOdd += str.length();
			}
		}
		return sumEven > sumOdd;
	}
	
	// Method 21:
	//public static boolean isPalindrome (String input) {
	//	char[] temp = input.toCharArray();
	//	char[] reverse = new char[temp.length];
	//	for (int i = temp.length - 1; i >= 0; i--) {
	//		int x = 0;
	//		reverse[x] = temp[i];
	//		x++;
	//	}
	//	String palindrome = new String(reverse);
	//	return palindrome.equals(input);
	//}
	
	public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length()/2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}

