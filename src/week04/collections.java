package week04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lists
		List<String> students = new ArrayList<String>();
		students.add("Rob");
		students.add("Rob");
		students.add("Sam");
		students.add(null);
		
		for (String student : students) {
			System.out.println(student);
		}
		
		System.out.println(students.get(2));
		System.out.println(students.get(0));

	
		//set
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		//states.add("Alabama");
		states.add("Alaska");
		
		for (String state : states) {
			System.out.println(state);
		}
		
		System.out.println(states.size());
		
		System.out.println(states.contains("Delaware"));
		System.out.println(states.contains("Alabama"));
		System.out.println(states.isEmpty());
		
		if(states.contains("Alabama")) {
			states.remove("Alabama");
		}
	
		
		//map 
		Map<Integer, String> racerPlace = new HashMap<Integer, String>();
		racerPlace.put(1,  "Tom");
		racerPlace.put(2,  "Sally");
		racerPlace.put(3,  "Aric");
		
		System.out.println(racerPlace.get(1));
		
		racerPlace.remove(1);
		
		Set<Integer> racerKeys = racerPlace.keySet();
		for (Integer key : racerKeys) {
			System.out.println(key + " : " + racerPlace.get(key));
		}
		
		Collection<String> racers = racerPlace.values();
		for (String racer : racers) {
			System.out.println(racer);
		}
		
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Augment", "Add to or increase.");
		dictionary.put("Diminish", "To take away from.");
		dictionary.put("Ostentatious","Showy, meant to attract attention.");
		
		
	}//end main 
	
	//methods

}//end class
