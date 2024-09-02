package week05;

public class Classes {

	public static void main(String[] args) {
		
		StringBuilder name = new StringBuilder();
		StringBuilder name2 = new StringBuilder();
		//use the Student object we created in Student.java
		Student student1 = new Student();
		//use dot notation to assign values to the instance of student
		student1.firstName = "Tom";
		student1.lastName = "Smith";
		student1.gradeLevel = 12;
		student1.phoneNumber = "480-123-4567";
		
		student1.introduce();
		
		Student student2 = new Student("Sammy", "Jones");
		student2.introduce();
		
		//with a Constructor, we can now pass all the parameters
		//directly into the parentheses instead of assigning each variable
		//like we did in the student1 case
		Student student3 = new Student("Tom", "Riddle", "333-3333", 11);
		student3.introduce();
	}//end main method
}
