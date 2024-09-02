package week05;

public class Student {
	//make a blueprint for the student class
	String firstName;
	String lastName;
	String phoneNumber;
	int gradeLevel;
	
	public Student(){}
	
	/*
	 * Constructors
	 */
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
		//assign a this. keyword to the firstName to show that it belongs to the class and 
		//not the method
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.gradeLevel = gradeLevel;
	}
	/*
	 * Public Methods
	 */
	//make a method that describes what the student can do
	public void introduce() {
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("I am in grade " + gradeLevel);
		System.out.println("My phone number is " + phoneNumber);
	}
	/*
	 * Private methods
	 */
	
	private boolean checkLength(String str, int length) {
		return str.length() > length;
	}
	
	
	/*
	 * Getters and Setters
	 */
	//write "getters and setters" to allow public access to the data
	//in a controlled way
	public void setFirstName(String firstName) {
		if(checkLength(firstName, 1)) {
		this.firstName = firstName;
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		if(checkLength(lastName, 1)) 
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(checkLength(phoneNumber, 9)) 
		this.phoneNumber = phoneNumber;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	
	public void setGradeLevel(int gradeLevel) {
		if (gradeLevel > 0 && gradelevel < 13) {
		this.gradeLevel = gradeLevel;
		}
	}
	
	public int getGradeLevel() {
		return gradeLevel;
	}
	
}// end class
