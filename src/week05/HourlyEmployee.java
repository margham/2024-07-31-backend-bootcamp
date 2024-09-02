package week05;

public class HourlyEmployee extends Employee {

	private double hoursWorked;
	
	public HourlyEmployee(String firstName, String lastName, double pay, double hoursWorked) {
		super(firstName, lastName, pay);//super = superclass we're inheriting from
										//in this case, Employee
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return getPay() * hoursWorked;
	}

}
