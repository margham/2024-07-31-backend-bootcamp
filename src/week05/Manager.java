package week05;

public class Manager extends Employee {
	
	private double bonusPercentage;
	
	public Manager(String firstName, String lastName, double pay, double bonusPercentage) {
		super(firstName, lastName, pay);
		this.bonusPercentage = bonusPercentage/100;
	}
	
	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		double base = getPay() * 80;
		return base + bonusPercentage;
	}
	
}
