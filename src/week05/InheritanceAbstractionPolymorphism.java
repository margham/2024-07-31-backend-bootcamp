package week05;

public class InheritanceAbstractionPolymorphism {

	public static void main(String[] args) {

	Employee salary = new SalariedEmployee("Tom", "Sawyer", 50.0);
	Employee hourly = new HourlyEmployee("Tom", "Salter", 15.00, 75.0);
	Employee manager = new Manager("Tom", "Tommyson", 450.00, 15.5);
	
	System.out.println(salary.calculatePay());
	System.out.println(hourly.calculatePay());
	System.out.println(manager.calculatePay());
	}
}
