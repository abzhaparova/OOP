package task2;

public class SavingsAccount extends Account {
	public double interestRate;
	
	public SavingsAccount(int accNumber, double interestRate) {
		super(accNumber);
		this.interestRate = interestRate;
	}
	
	public void addInterestRate() {
		super.setBalance(super.getBalance() * this.interestRate);
	}
	
	public String toString() {
		return super.getAccountNumber()+" " + super.getBalance()+this.interestRate;
	}
	
	}

	