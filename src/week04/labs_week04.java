package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class labs_week04 {


public static void main(String[] args) {

	// 1. Why would we use a StringBuilder instead of a String?
	// 		a. Instantiate a new StringBuilder
	//		b. Append the characters 0 through 9 to it separated by dashes
	// 				Note:  make sure no dash appears at the end of the StringBuilder
	StringBuilder numberString = new StringBuilder();
	for (int i = 0; i < 10; i++) {
		if (i != 9) {
			numberString.append(i + "-");
		} else {
			numberString.append(i);
			}
	}
	System.out.println(numberString.toString());
	System.out.println("-------------------------------");
	// 2. List of String:
	//		a. Create a list of Strings 
	//		b. Add 5 Strings to it, each with a different length
	List<String> colors = new ArrayList<String>();
	colors.add("Orange");
	colors.add("Yellow");
	colors.add("Red");
	colors.add("Blue");
	colors.add("Chartreuse");
	
	for (String color : colors) {
		System.out.println(color);
	}
	
	System.out.println("-------------------------------");
	//make it shorter
	//List<String> colors = Arrays.asList("Orange");
	
	// 3. Write and test a method that takes a list of strings 
	//			and returns the shortest string
	System.out.println(findShortestString(colors));
	System.out.println("-------------------------------");

	// 4. Write and test a method that takes a list of strings 
	//			and returns the list with the first and last element switched
	List<String> swapped = swapFirstAndLast(colors);
	for (String string : swapped) {
		System.out.println(string);
	}
	System.out.println("-------------------------------");


	// 5. Write and test a method that takes a list of strings 
	//			and returns a string with all the list elements concatenated to each other,
	// 			separated by a comma
	String concat = concatenateStrings(colors);
	System.out.println(concat);
	System.out.println("-------------------------------");

	
	// 6. Write and test a method that takes a list of strings and a string 
	//			and returns a new list with all strings from the original list
	// 			containing the second string parameter (i.e. like a search method)
	List<String> dogs = new ArrayList<String>();
	dogs.add("Labrador");
	dogs.add("Mountain Cur");
	dogs.add("Dalmatian");
	dogs.add("Schnauzer");
	dogs.add("Beagle");
	
	String test = "i";
	
	System.out.println(strSearch(dogs, test));
	System.out.println("-------------------------------");
	
	// 7. Write and test a method that takes a list of integers 
	//			and returns a List<List<Integer>> with the following conditions specified
	//			for the return value:
	//		a. The first List in the returned value contains any number from the input list 
	//			that is divisible by 2
	//		b. The second List contains values from the input list that are divisible by 3
	//		c. The third containing values divisible by 5, and 
	//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
	List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 14, 15, 18, 19);
	
	List<List<Integer>> sorted = groupIntegers(nums);
	
	for(List<Integer> list : sorted) {
		for (Integer number : list) {
			System.out.println(number);
		}
		System.out.println("-------------------------------");

	}
	
	//System.out.print(groupIntegers(nums));
	
	// 8. Write and test a method that takes a list of strings 
	//			and returns a list of integers that contains the length of each string
	List<Integer> lengths = countLengths(dogs);
	for (Integer num : lengths) {
		System.out.println(num);
	}

	System.out.println("-------------------------------");

	// 9. Create a set of strings and add 5 values
	Set<String> set = new HashSet<String>();
	set.add("Hello");
	set.add("My");
	set.add("Name");
	set.add("Is");
	set.add("Ivonne");
	
	/*Iterator itr = set.iterator();
	while (itr.hasNext()) {
		System.out.println(set.iterator());
	}*/
	System.out.println(set);
	System.out.println("-------------------------------");
	
	// 10. Write and test a method that takes a set of strings and a character 
	//			and returns a set of strings consisting of all the strings in the
	// 			input set that start with the character parameter.
	System.out.println(charSearch(set, 'H'));
	System.out.println("-------------------------------");

	// 11. Write and test a method that takes a set of strings 
	//			and returns a list of the same strings
	List<String> newList = setToList(set);
	for (String l : newList) {
		System.out.println(l);
	}
	
	System.out.println("-------------------------------");

	// 12. Write and test a method that takes a set of integers 
	//			and returns a new set of integers containing only even numbers 
	//			from the original set
	Set<Integer> numberSet = new HashSet<Integer>();
		numberSet.add(1);
		numberSet.add(2);
		numberSet.add(3);
		numberSet.add(5);
		numberSet.add(8);
		numberSet.add(9);
		numberSet.add(17);
		numberSet.add(32);
		numberSet.add(64);
		numberSet.add(12);
		
	Set<Integer> evenNums = evensOnly(numberSet);
	
	for (Integer num : evenNums) {
		System.out.println(num);
	}
	
	System.out.println("-------------------------------");

	// 13. Create a map of string and string and add 3 items to it where the key of each
	// 			is a word and the value is the definition of the word
	Map<String, String> dictionary = new HashMap<String, String>();
	dictionary.put("Apple", "A sweet and sour crunchy fruit with colorful skin and white flesh.");
	dictionary.put("Banana", "A yellow fruit that rots before you can get to it.");
	dictionary.put("Coffee", "A delicious bitter drink made from dried coffee beans.");

	
	// 14. Write and test a method that takes a Map<String, String> and a string 
	// 			and returns the value for a key in the map that matches the
	// 			string parameter (i.e. like a language dictionary lookup)
	String value = lookUpValue(dictionary, "Coffee");
	System.out.println(value);
	System.out.println("-------------------------------");

	// 15. Write and test a method that takes a List<String> 
	//			and returns a Map<Character, Integer> containing a count of 
	//			all the strings that start with a given character
	Map<Character, Integer> startsWithChar = stringCounter(dogs, 'M');
	System.out.println(startsWithChar);
	
	Map<Character, Integer> charStartCounts = startingChars(dogs);
	System.out.println(charStartCounts);
	System.out.println("-------------------------------");

}//end main method

//Method 15.b
public static Map<Character, Integer> startingChars(List<String> listOfStrings){
	Map<Character, Integer> results = new HashMap<Character, Integer>();
	
	for (String string : listOfStrings) {
		char c = string.charAt(0);
		if (results.get(c) == null) {
			results.put(c, 1);
		} else {
			results.put(c,  results.get(c) + 1);
		}
	}
	return results;
}

// Method 15:
public static Map<Character, Integer> stringCounter(List<String> list, char c) {
	Map<Character, Integer> result = new HashMap<Character, Integer>();
	int count = 0;
	for (String str : list) {
		if (str.charAt(0) == c) {
			count += 1;
		}
	}
	result.put(c, count);
	return result;
}


// Method 14:
public static String lookUpValue(Map<String, String> map, String checker) {
	for (String key : map.keySet()) {
		if (key.equals(checker)) {
			return map.get(key);
		}
	}
	return "";
}


// Method 12:
public static Set<Integer> evensOnly(Set<Integer> ints){
	Set<Integer> evens = new HashSet<Integer>();
	for (Integer in : ints) {
		if(in % 2 == 0) {
			evens.add(in);
		}
	}
	return evens;
}


// Method 11:
public static List<String> setToList(Set<String> setIn){
	List<String> resultList = new ArrayList<String>();
	for (String s : setIn) {
		resultList.add(s);
	}
	return resultList;
}


// Method 10:
public static Set<String> charSearch(Set<String> input, char c){
	Set<String> output = new HashSet<String>();
	for (String in : input) {
		if (in.charAt(0) == c) {
			output.add(in);
		}
	}
	return output;
}


// Method 8:
public static List<Integer> countLengths(List<String> strings){
	List<Integer> result = new ArrayList<Integer>();
	for (String str : strings) {
		result.add(str.length());
	}
	return result;
}


// Method 7:
//public static List<List> groupIntegers(List<Integer> list){
/*	List<Integer> divisibleBy2 = new ArrayList<Integer>();
	List<Integer> divisibleBy3 = new ArrayList<Integer>();
	List<Integer> divisibleBy5 = new ArrayList<Integer>();
	List<Integer> indivisible = new ArrayList<Integer>();
	
	for (int num : list) {
		if (num % 2 == 0) {
			divisibleBy2.add(num);
		}
		else if (num % 3 == 0) {
			divisibleBy3.add(num);
		}
		else if (num % 5 == 0) {
			divisibleBy5.add(num);
		}
		else {
			indivisible.add(num);
		}
	}
	List<List> masterList = new ArrayList<List>();
	masterList.add(divisibleBy2);
	masterList.add(divisibleBy3);
	masterList.add(divisibleBy5);
	masterList.add(indivisible);
	return masterList;
}
*/
public static List<List<Integer>> groupIntegers(List<Integer> list) {
	List<List<Integer>> masterList = new ArrayList<List<Integer>>();
	masterList.add(new ArrayList<Integer>());
	masterList.add(new ArrayList<Integer>());
	masterList.add(new ArrayList<Integer>());
	masterList.add(new ArrayList<Integer>());

for (Integer num : list) {
	if (num % 2 == 0) {
		masterList.get(0).add(num);
	} else if (num % 3 == 0) {
		masterList.get(1).add(num);	
	} else if (num % 5 == 0) {
		masterList.get(2).add(num);
	} else {
		masterList.get(3).add(num);
	}
}
	return masterList;
}

// Method 6:
public static List<String> strSearch(List<String> words, String str) {
	List<String> results = new ArrayList<String>();
	for (String word : words) {
		if (word.contains(str)) {
			results.add(word);
		}
	}
	return results;
}

// Method 5:
public static String concatenateStrings(List<String> strings) {
	StringBuilder combined = new StringBuilder();
	for (int i = 0; i < strings.size(); i++) {
		combined.append(strings.get(i) + ", ");
	}
	return combined.toString();
}
	

// Method 4:
public static List<String> swapFirstAndLast(List<String> list) {
	String temp = list.get(0);
	list.set(0, list.get(list.size() - 1));
	list.set(list.size() - 1, temp);
	return list;
}


// Method 3:
//method 3
public static String findShortestString(List<String> list) {
	String shortest = list.get(0);
	for (String string : list) {
		if (string.length() < shortest.length()) {
			shortest = string; 
		}
}
return shortest;
}


}