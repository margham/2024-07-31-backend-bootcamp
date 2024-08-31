package week04;

public class coding_assignment_week04 {
	
	public static void main(String[] args) {
	
//question 1
	System.out.println("Question 1: Manipulating Arrays");	
	
	//1a.create an array of int called *ages* that contains: 3, 9, 23, 64, 2, 8, 28, 93
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
	//1b.programmatically subtract the first element in the array from the last element in the array.
	int subtractFirstFromLast = ages[ages.length - 1] - ages[0];
	
	//1c.print the result to the console
	System.out.println("The value of the last element \n minus the first element is: "+ subtractFirstFromLast);
	System.out.println("--------------------------------"); //separating out the questions

//question 2
	System.out.println("Question 2: Manipulating String Arrays");	
	
	//2a. Create an array of String called names containing "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	//2b. iterate through the array, calculate the average number of letters per name. 
       	//print the result to the console.
	int totalLength = 0;
	for (String name : names) {
		totalLength += name.length();
	}
	int avgNameLength = totalLength / names.length;
	System.out.println("The average name (rounded to the \n nearest integer) has " + avgNameLength + " letters.");
	System.out.println("--------------------------------"); 
	
//question 3
	System.out.println("Question 3: How do you access the last element of any array?");
	System.out.println("Access the last element of any array by \n "
			+ "indexing it using [length - 1]. For example, for an \n "
			+ "array called numbers, access the last element \n by calling "
			+ "numbers[numbers.length - 1].");	
	
	System.out.println("--------------------------------"); 

//question 4
	System.out.println("Question 4: How do you access the first element of any array?");
	System.out.println("Access the first element of any array by \n "
				+ "indexing it using [0]. For example, for an \n "
				+ "array called numbers, access the first element \n by calling "
				+ "numbers[0].");
	System.out.println("--------------------------------"); 
	
//question 5
	System.out.println("Question 5: add length of each name to nameLengths array");
	//5a. Create a new array of int called nameLengths. 
	int[] nameLengths = new int[names.length];
		
	//5b. Write a loop to iterate over the previously created names array and add the length 
		//of each name to the nameLengths array.		
	int i = 0;
	for (String name : names) {
		nameLengths[i] = name.length();
		i++;
	}
	System.out.println("--------------------------------"); 
//question 6
	System.out.println("Question 6: calculate and print sum of nameLengths array");
	//iterate over the nameLengths array and calculate the sum of all elements
	int sumLengths = 0;
	for (int len : nameLengths) {
		sumLengths += len;
	}
	//print to console
	System.out.println("The sum of all the name lengths is: " + sumLengths);
	System.out.println("--------------------------------"); 

//question 7
	System.out.println("Question 7: Write a method to take a String (word) and int (n) \n"
			+ "and return the word concatenated to itself n times");
	
	System.out.println("--------------------------------"); 

//question 8
	System.out.println("Question 8: Write a method to take a String (word) and int (n) \n"
				+ "and return the word concatenated to itself n times");
		
	System.out.println("--------------------------------"); 
		
//question 9
	System.out.println("Question 9: Write a method to take a String (word) and int (n) \n"
				+ "and return the word concatenated to itself n times");
		
	System.out.println("--------------------------------"); 

//question 10
	System.out.println("Question 10: Write a method to take a String (word) and int (n) \n"
				+ "and return the word concatenated to itself n times");
		
	System.out.println("--------------------------------"); 
	
//question 11
	System.out.println("Question 11: Write a method to take a String (word) and int (n) \n"
				+ "and return the word concatenated to itself n times");
		
	System.out.println("--------------------------------"); 	
	
//question 12
	System.out.println("Question 12: Write a method to take a String (word) and int (n) \n"
				+ "and return the word concatenated to itself n times");
			
	System.out.println("--------------------------------"); 	
	
//question 13
	System.out.println("Question 13: Write a method to take a String (word) and int (n) \n"
				+ "and return the word concatenated to itself n times");
			
	System.out.println("--------------------------------"); 	
	
	}//end main method

}//end class
