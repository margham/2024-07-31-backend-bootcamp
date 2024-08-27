package week04;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//list<E> reads as 'list of E data type'
		//list<String> reads as 'list of Strings'
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		
		sports.remove(1);
		
		System.out.println(sports);
		
		for (int i = 0; i < sports.size(); i++) { //list.size() is a method
			System.out.println(sports.get(i));
		}
		
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		
	} //end of public static void main program
	
	//put methods here

} //end of class
